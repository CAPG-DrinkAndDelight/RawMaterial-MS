package com.cg.dd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dd.entities.DeliveryStatusDto;
import com.cg.dd.entities.RawMaterialOrder;
import com.cg.dd.entities.SupplierDetails;
import com.cg.dd.exception.RawMaterialOrderNotFoundException;
import com.cg.dd.exception.SupplierDetailsNotFoundException;
import com.cg.dd.service.RawMaterialOrderService;

@RestController
@RequestMapping("/home")
public class RawMaterialOrderController {
	@Autowired
	private RawMaterialOrderService service;

	@PostMapping("/placeRawMaterialOrder")
	public String placeProductOrder(@RequestBody RawMaterialOrder rawMaterialOrder) {
		return service.placeRawMaterialOrder(rawMaterialOrder);

	}

	@PostMapping("/updateRawMaterialDeliveryStatus")
	public String updateDeliveryStatus(@RequestBody DeliveryStatusDto dto) {

		return service.updateStatusRawMaterialOrder(dto.getOrderId(), dto.getDeliveryStatus());
	}

	@GetMapping("/displayRawMaterialOrder")

	public List<RawMaterialOrder> displayProductOrders() throws RawMaterialOrderNotFoundException {
		List<RawMaterialOrder> list = service.displayRawMaterialOrder();
		if (list == null)
			throw new RawMaterialOrderNotFoundException("Sry we didn't not found any data in database");
		return list;
	}

	@GetMapping("/getsupplierdetails/{supplierID}")
	public SupplierDetails getDistributorDetails(@PathVariable String distributorId)
			throws RawMaterialOrderNotFoundException {
		return service.getSuplierDetails(distributorId);
	}

	@GetMapping("/getallsupplierdetails")
	public List<SupplierDetails> displayAllDistributorDetails() throws SupplierDetailsNotFoundException {
		List<SupplierDetails> list = service.displayAllSupplierDetails();
		if (list == null)
			throw new SupplierDetailsNotFoundException("Sry we not found any data in database");
		return list;

	}
}

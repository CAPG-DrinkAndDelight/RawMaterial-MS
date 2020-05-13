package com.cg.dd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dd.dao.RawMaterialOrderDao;
import com.cg.dd.dao.SupplierDetailsDao;
import com.cg.dd.entities.RawMaterialOrder;
import com.cg.dd.entities.SupplierDetails;
import com.cg.dd.exception.RawMaterialOrderNotFoundException;

public class RawMaterialServiceImpl implements RawMaterialOrderService {

	@Autowired
	private RawMaterialOrderDao orderDao;
	@Autowired
	private SupplierDetailsDao suppDao;

	@Override
	public String updateStatusRawMaterialOrder(String orderId, String deliveryStatus) {
		Optional<RawMaterialOrder> optional = orderDao.findById(orderId);
		if (optional.isPresent()) {
			RawMaterialOrder order = optional.get();
			order.setDeliveryStatus(deliveryStatus);
			return "Delivery status updated successfully";
		}
		throw new RawMaterialOrderNotFoundException("Order Id doesn't exist");

	}

	@Override
	public String placeRawMaterialOrder(RawMaterialOrder rawMaterialOrder) {
		rawMaterialOrder = orderDao.save(rawMaterialOrder);
		return "Order placed successfully";
	}

	@Override
	public List<RawMaterialOrder> displayRawMaterialOrder() {
		List<RawMaterialOrder> orders = orderDao.findAll();
		return orders;

	}

	@Override
	public SupplierDetails getSuplierDetails(String supplierID) {

		Optional<SupplierDetails> optional = suppDao.findById(supplierID);
		if (optional.isPresent()) {
			return optional.get();
		}
		throw new RawMaterialOrderNotFoundException("Order Id doesn't exist");

	}

	@Override
	public List<SupplierDetails> displayAllSupplierDetails() {
		List<SupplierDetails> details = suppDao.findAll();
		return details;
	}

}

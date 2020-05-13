package com.cg.dd.service;

import java.util.List;

import com.cg.dd.entities.RawMaterialOrder;
import com.cg.dd.entities.SupplierDetails;

public interface RawMaterialOrderService {

	String updateStatusRawMaterialOrder(String orderId, String deliveryStatus);

	String placeRawMaterialOrder(RawMaterialOrder rawMaterialOrder);

	List<RawMaterialOrder> displayRawMaterialOrder();

	SupplierDetails getSuplierDetails(String supplierID);

	List<SupplierDetails> displayAllSupplierDetails();

}

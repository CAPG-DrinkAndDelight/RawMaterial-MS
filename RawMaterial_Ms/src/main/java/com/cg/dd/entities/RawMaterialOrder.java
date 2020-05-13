package com.cg.dd.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raw_material_order")
public class RawMaterialOrder {
	@Id
	private String orderId;
	private String name;
	private double price_per_uni;
	private double quantityValue;
	private String warehouseID;
	private String supplierID;
	private String quantityUnit;
	private Date dateOfOrder;
	private Date dateOfDelivery;
	private double totalPrice;
	private String deliveryStatus;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice_per_uni() {
		return price_per_uni;
	}

	public void setPrice_per_uni(double price_per_uni) {
		this.price_per_uni = price_per_uni;
	}

	public double getQuantityValue() {
		return quantityValue;
	}

	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}

	public String getWarehouseID() {
		return warehouseID;
	}

	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public Date getDateOfOrder() {
		return dateOfOrder;
	}

	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}

	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public RawMaterialOrder(String orderId, String name, double price_per_uni, double quantityValue, String warehouseID,
			String supplierID, String quantityUnit, Date dateOfOrder, Date dateOfDelivery, double totalPrice,
			String deliveryStatus) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.price_per_uni = price_per_uni;
		this.quantityValue = quantityValue;
		this.warehouseID = warehouseID;
		this.supplierID = supplierID;
		this.quantityUnit = quantityUnit;
		this.dateOfOrder = dateOfOrder;
		this.dateOfDelivery = dateOfDelivery;
		this.totalPrice = totalPrice;
		this.deliveryStatus = deliveryStatus;
	}

	@Override
	public String toString() {
		return "RawMaterialOrder [orderId=" + orderId + ", name=" + name + ", price_per_uni=" + price_per_uni
				+ ", quantityValue=" + quantityValue + ", warehouseID=" + warehouseID + ", supplierID=" + supplierID
				+ ", quantityUnit=" + quantityUnit + ", dateOfOrder=" + dateOfOrder + ", dateOfDelivery="
				+ dateOfDelivery + ", totalPrice=" + totalPrice + ", deliveryStatus=" + deliveryStatus + "]";
	}

}

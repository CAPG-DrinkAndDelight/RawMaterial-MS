package com.cg.dd.entities;

import java.util.Date;

public class RawMaterialStock {
private String orderId;
private String name;
private double price_per_uni;
private double quantityValue;
private double price;
private String warehouseID;
private Date deliveryDate;
private Date manufacturingDate;
private Date expiryDate;
private String qualityCheck;
private Date processDate;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getWarehouseID() {
	return warehouseID;
}
public void setWarehouseID(String warehouseID) {
	this.warehouseID = warehouseID;
}
public Date getDeliveryDate() {
	return deliveryDate;
}
public void setDeliveryDate(Date deliveryDate) {
	this.deliveryDate = deliveryDate;
}
public Date getManufacturingDate() {
	return manufacturingDate;
}
public void setManufacturingDate(Date manufacturingDate) {
	this.manufacturingDate = manufacturingDate;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
public String getQualityCheck() {
	return qualityCheck;
}
public void setQualityCheck(String qualityCheck) {
	this.qualityCheck = qualityCheck;
}
public Date getProcessDate() {
	return processDate;
}
public void setProcessDate(Date processDate) {
	this.processDate = processDate;
}
public RawMaterialStock(String orderId, String name, double price_per_uni, double quantityValue, double price,
		String warehouseID, Date deliveryDate, Date manufacturingDate, Date expiryDate, String qualityCheck,
		Date processDate) {
	super();
	this.orderId = orderId;
	this.name = name;
	this.price_per_uni = price_per_uni;
	this.quantityValue = quantityValue;
	this.price = price;
	this.warehouseID = warehouseID;
	this.deliveryDate = deliveryDate;
	this.manufacturingDate = manufacturingDate;
	this.expiryDate = expiryDate;
	this.qualityCheck = qualityCheck;
	this.processDate = processDate;
}
@Override
public String toString() {
	return "RawMaterialDetai [orderId=" + orderId + ", name=" + name + ", price_per_uni=" + price_per_uni
			+ ", quantityValue=" + quantityValue + ", price=" + price + ", warehouseID=" + warehouseID
			+ ", deliveryDate=" + deliveryDate + ", manufacturingDate=" + manufacturingDate + ", expiryDate="
			+ expiryDate + ", qualityCheck=" + qualityCheck + ", processDate=" + processDate + "]";
}

}

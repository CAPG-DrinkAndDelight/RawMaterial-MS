package com.cg.dd.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supplier_details")
public class SupplierDetails {
	@Id
	private String supplierID;
	private String name;
	private String Address;
	private Long phoneNumber;

	public String getSuplierId() {
		return supplierID;
	}

	public void setSuplierId(String suplierId) {
		this.supplierID = suplierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "SuplierDetails [suplierId=" + supplierID + ", name=" + name + ", Address=" + Address + ", phoneNumber="
				+ phoneNumber + "]";
	}

	public SupplierDetails(String supplierID, String name, String address, Long phoneNumber) {
		super();
		this.supplierID = supplierID;
		this.name = name;
		Address = address;
		this.phoneNumber = phoneNumber;
	}

}

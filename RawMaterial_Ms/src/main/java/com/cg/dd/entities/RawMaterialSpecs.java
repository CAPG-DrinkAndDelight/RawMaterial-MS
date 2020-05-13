package com.cg.dd.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "raw_material_spec")
public class RawMaterialSpecs {
	@Id
	private String rmsId;
	private String name;
	private double pricePerUnit;
	private int duration;
	private String description;

	public String getRmsId() {
		return rmsId;
	}

	public void setRmsId(String rmsId) {
		this.rmsId = rmsId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RawMaterialSpecs [rmsId=" + rmsId + ", name=" + name + ", pricePerUnit=" + pricePerUnit + ", duration="
				+ duration + ", description=" + description + "]";
	}

	public RawMaterialSpecs(String rmsId, String name, double pricePerUnit, int duration, String description) {
		super();
		this.rmsId = rmsId;
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.duration = duration;
		this.description = description;
	}

}

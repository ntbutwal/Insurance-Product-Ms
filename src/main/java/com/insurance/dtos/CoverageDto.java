package com.insurance.dtos;

import java.io.Serializable;

public class CoverageDto implements Serializable {

	private static final long serialVersionUID = -3651483509483745013L;

	private Long id;
	private String unit;
	private Double yearlyIncome;
	private Double coverage;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Double getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(Double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}

	public Double getCoverage() {
		return coverage;
	}

	public void setCoverage(Double coverage) {
		this.coverage = coverage;
	}

}

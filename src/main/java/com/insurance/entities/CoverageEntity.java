package com.insurance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Coverage")
public class CoverageEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Unit")
	private String unit;

	@Column(name = "Coverage")
	private Double coverage;

	@ManyToOne
	@JoinColumn(name = "Benefit_id")
	private BenefitEntity benefitEntity;

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

	public Double getCoverage() {
		return coverage;
	}

	public void setCoverage(Double coverage) {
		this.coverage = coverage;
	}

	public BenefitEntity getBenefitEntity() {
		return benefitEntity;
	}

	public void setBenefitEntity(BenefitEntity benefitEntity) {
		this.benefitEntity = benefitEntity;
	}

}

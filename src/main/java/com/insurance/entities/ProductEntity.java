package com.insurance.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "pid")
	private String pid;

	@Column(name = "product_code")
	private Long code;

	@Column(name = "product_type")
	private String productType;

	@OneToMany(mappedBy = "productEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<BenefitEntity> benefitEntities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public List<BenefitEntity> getBenefitEntities() {
		return benefitEntities;
	}

	public void setBenefitEntities(List<BenefitEntity> benefitEntities) {
		this.benefitEntities = benefitEntities;
	}

}

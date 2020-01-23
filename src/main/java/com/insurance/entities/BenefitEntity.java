package com.insurance.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Benefits")
public class BenefitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Description")
	private String desc;

	@ManyToOne
	@JoinColumn(name = "Product_Id")
	private ProductEntity productEntity;

	@OneToMany(mappedBy = "benefitEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<CoverageEntity> coverageEntities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public List<CoverageEntity> getCoverageEntities() {
		return coverageEntities;
	}

	public void setCoverageEntities(List<CoverageEntity> coverageEntities) {
		this.coverageEntities = coverageEntities;
	}

}

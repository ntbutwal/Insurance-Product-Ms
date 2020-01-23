package com.insurance.dtos;

import java.io.Serializable;
import java.util.List;

public class ProductDto implements Serializable {

	private static final long serialVersionUID = 5537205469317202480L;

	private Long id;
	private String pid;
	private Long code;
	private String productType;
	private List<BenefitsDto> benefitsDtos;
	private List<CoverageDto> coverageDtos;

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

	public List<BenefitsDto> getBenefitsDtos() {
		return benefitsDtos;
	}

	public void setBenefitsDtos(List<BenefitsDto> benefitsDtos) {
		this.benefitsDtos = benefitsDtos;
	}

	public List<CoverageDto> getCoverageDtos() {
		return coverageDtos;
	}

	public void setCoverageDtos(List<CoverageDto> coverageDtos) {
		this.coverageDtos = coverageDtos;
	}

}

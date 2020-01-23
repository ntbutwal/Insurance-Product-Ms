package com.insurance.dtos;

import java.io.Serializable;
import java.util.List;

public class BenefitsDto implements Serializable{

	
	private static final long serialVersionUID = 270126290162355922L;
	
	private Long id;
	private String des;
	private List<CoverageDto> coverageDtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public List<CoverageDto> getCoverageDtos() {
		return coverageDtos;
	}

	public void setCoverageDtos(List<CoverageDto> coverageDtos) {
		this.coverageDtos = coverageDtos;
	}

}

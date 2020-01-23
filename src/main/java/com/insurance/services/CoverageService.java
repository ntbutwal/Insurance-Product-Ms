package com.insurance.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dtos.BenefitsDto;
import com.insurance.dtos.CoverageDto;
import com.insurance.entities.BenefitEntity;
import com.insurance.entities.CoverageEntity;
import com.insurance.repositories.CoverageRepository;

@Service
public class CoverageService {
	
	private CoverageDto coverageDto;

	@Autowired
	private CoverageRepository coverageRepository;

//	public BenefitsDto convertCoverage(BenefitEntity be) {
//		BenefitsDto bdto = null;
//		if (be != null) {
//			bdto = new BenefitsDto();
//			ArrayList<CoverageDto> cdtos = new ArrayList<CoverageDto>();
//			CoverageDto cdto = new CoverageDto();
//			for (CoverageEntity cEntity : be.getCoverageEntities()) {
//				cdto.setId(cEntity.getId());
//				cdto.setCoverage(cEntity.getCoverage());
//				cdto.setUnit(cEntity.getUnit());
//				cdtos.add(cdto);
//			}
//			bdto.setCoverageDtos(cdtos);
//		}
//		return bdto;
//
//	}

	public CoverageDto convertCoverage(CoverageEntity ce) {
		CoverageDto cdto = new CoverageDto();
		if (ce != null) {
//			cdto = new CoverageDto();
			cdto.setId(ce.getId());
			cdto.setUnit(ce.getUnit());
			cdto.setCoverage(ce.getCoverage());
		}
		return cdto;
	}

	public void calculateCoverageAmount() {
		if (coverageDto.getYearlyIncome() < 20000) {
			coverageRepository.findByCoverage(100.00);
		} else if (coverageDto.getYearlyIncome() < 34000 && coverageDto.getYearlyIncome() > 20000) {
			coverageRepository.findByCoverage(80.00);
		} else if (coverageDto.getYearlyIncome() < 52000 && coverageDto.getYearlyIncome() > 34000) {
			coverageRepository.findByCoverage(60.00);
		} else
			coverageRepository.findByCoverage(50.00);

	}

}

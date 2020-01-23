package com.insurance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.dtos.BenefitsDto;
import com.insurance.dtos.CoverageDto;
import com.insurance.dtos.ProductDto;
import com.insurance.entities.BenefitEntity;
import com.insurance.entities.CoverageEntity;
import com.insurance.entities.ProductEntity;
import com.insurance.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CoverageService coverageService;

	public List<ProductDto> getproduct() {

		List<ProductEntity> pent = productRepository.findAll();
		System.out.println(pent);
		List<ProductDto> pdto = new ArrayList<ProductDto>();
		for (ProductEntity ent : pent) {
			ProductDto pdt = convertproduct(ent);
			pdto.add(pdt);
		}
		return pdto;

	}

	public ProductDto convertproduct(ProductEntity pe) {
		ProductDto dto = new ProductDto();
		if (pe != null) {
			dto.setId(pe.getId());
			dto.setPid(pe.getPid());
			dto.setCode(pe.getCode());
			dto.setProductType(pe.getProductType());

			List<BenefitsDto> bdtos = new ArrayList<BenefitsDto>();
			BenefitsDto bdto = new BenefitsDto();
			for (BenefitEntity bentity : pe.getBenefitEntities()) {
				bdto.setId(bentity.getId());
				bdto.setDes(bentity.getDesc());
				bdtos.add(bdto);
			}
			dto.setBenefitsDtos(bdtos);

			BenefitEntity be = new BenefitEntity();
			List<CoverageEntity> centEntities = be.getCoverageEntities();

			List<CoverageDto> coverageD = new ArrayList<CoverageDto>();
			//System.out.println(coverageD);
			for (CoverageEntity ce : centEntities) {
				CoverageDto coverageDto = coverageService.convertCoverage(ce);
				coverageD.add(coverageDto);
			}
			bdto.setCoverageDtos(coverageD);

		}
		return dto;

	}

}

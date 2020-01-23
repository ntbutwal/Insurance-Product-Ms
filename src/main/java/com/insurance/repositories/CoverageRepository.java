package com.insurance.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.entities.CoverageEntity;

@Repository
public interface CoverageRepository extends CrudRepository<CoverageEntity, Long> {

	public CoverageEntity findByCoverage(Double coverage);

}

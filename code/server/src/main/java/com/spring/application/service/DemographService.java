package com.spring.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.application.model.AreaDemograph;
import com.spring.application.repository.DemographRepository;

@Service
public class DemographService {
	@Autowired
    private DemographRepository demoRepo;
	
	public List<Object[]> findAllAreaGeoCode() {
		List<Object[]> areas = demoRepo.findAllAreaDemograph();
		return areas;
	}
	
}

package com.crossover.techtrial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crossover.techtrial.model.DailyElectricity;
import com.crossover.techtrial.repository.DailyElectricityRepository;

@Service
public class DailyElectricityServiceImpl implements DailyElectricityService {
	
	@Autowired
	DailyElectricityRepository dailyElectricityRepository;
	
	public List<DailyElectricity> getAllDailyElectricityByPanelId(Long panelId) {
		return dailyElectricityRepository.findAllByPanelIdOrderByDateDesc(panelId); 
	}

	@Override
	public DailyElectricity save(DailyElectricity dailyElectricity) {
		return dailyElectricityRepository.save(dailyElectricity);
	}
	  
}

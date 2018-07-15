package com.crossover.techtrial.service;

import java.util.List;

import com.crossover.techtrial.model.DailyElectricity;

public interface DailyElectricityService {
	DailyElectricity save(DailyElectricity dailyElectricity);
	
	List<DailyElectricity> getAllDailyElectricityByPanelId(Long panelId);
}

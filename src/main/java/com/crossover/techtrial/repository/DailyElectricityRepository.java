package com.crossover.techtrial.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.crossover.techtrial.model.DailyElectricity;

/**
 * DailyElectricity Repository is for all operations for DailyElectricity.
 * @author Crossover
 */
@RestResource(exported = false)
public interface DailyElectricityRepository 
    extends PagingAndSortingRepository<DailyElectricity,Long> {
  
	List<DailyElectricity> findAllByPanelIdOrderByDateDesc(Long panelId);
}

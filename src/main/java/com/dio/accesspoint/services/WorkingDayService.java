package com.dio.accesspoint.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.accesspoint.model.WorkingDay;
import com.dio.accesspoint.repositorys.WorkingDayRepository;

@Service
public class WorkingDayService {
	
	WorkingDayRepository repository;
	
	@Autowired
	public WorkingDayService(WorkingDayRepository workingDayRepository) {
		this.repository = workingDayRepository;
	}
	
	public WorkingDay create(WorkingDay data) {
	  return repository.save(data);
		
	}

	public List<WorkingDay> findAll() {
		
		return repository.findAll();
	}

	public Optional<WorkingDay> findById(Long id) {
		
		return repository.findById(id);
	}

	public WorkingDay upDate(WorkingDay data) {
		  return repository.save(data);
			
		}
	
	public void delete(Long id) {
		
		 repository.deleteById(id);
	}
	



}

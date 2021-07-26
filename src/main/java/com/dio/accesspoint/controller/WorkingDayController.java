package com.dio.accesspoint.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.accesspoint.model.WorkingDay;
import com.dio.accesspoint.services.WorkingDayService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/journey")
public class WorkingDayController {
	
	@Autowired
	WorkingDayService service;
	
	@PostMapping
	public  ResponseEntity<WorkingDay> createWorkingDay(@RequestBody WorkingDay data) {
		return ResponseEntity.ok(service.create(data));
	}
	
	@PutMapping
	public  ResponseEntity<WorkingDay> upDateWorkingDay(@RequestBody WorkingDay data) {
		return ResponseEntity.ok(service.upDate(data));
	}
	@DeleteMapping("/{id}")
	public void deleteWorkingDay(@PathVariable("id") Long id) {
		service.delete(id);
	}
	
	@GetMapping
	public ResponseEntity<List<WorkingDay>>getWorkingDay(){
		return ResponseEntity.ok(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<WorkingDay>  getWorkingDayById(@PathVariable("id") Long id) throws Exception{
		
		return ResponseEntity.ok(service.findById(id).orElseThrow(()-> new NoSuchElementException("Not found")));
	}
	
}

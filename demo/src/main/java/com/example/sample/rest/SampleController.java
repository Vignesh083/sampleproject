package com.example.sample.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.SampleModel;
import com.example.sample.service.SampleService;

@RestController
@RequestMapping("/api/persons")
public class SampleController {
	
	@Autowired
	SampleService sampleService;
	
	
	 @PostMapping
	    public ResponseEntity<SampleModel> createPerson(@RequestBody SampleModel person) {
	        SampleModel savedPerson = sampleService.savePerson(person);
	        return ResponseEntity.ok(savedPerson);
	    }
	 
	 @GetMapping("/{id}")
		public ResponseEntity<Optional<SampleModel>> getPerson(@PathVariable Long id) {
			Optional<SampleModel> person = sampleService.getPersonById(id);
			return ResponseEntity.ok(person);
			
		}

}

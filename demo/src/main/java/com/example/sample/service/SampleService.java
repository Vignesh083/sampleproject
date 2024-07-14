package com.example.sample.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sample.model.SampleModel;
import com.example.sample.repo.SampleRepo;

@Service
public class SampleService {
	
	
	
	@Autowired
	SampleRepo repo;

	public SampleModel savePerson(SampleModel person) {
		if (person != null) {
			return repo.save(person);
			
		}
		return person;
		
	}

	public Optional<SampleModel> getPersonById(Long id) {
		Optional<SampleModel> model = null;
		if (id != null) {
			model = repo.findById(id);

		}
		return model;
	}

}

package com.example.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.model.SampleModel;

@Repository
public interface SampleRepo extends JpaRepository<SampleModel, Long>{
	
	SampleModel findById(int id);
	
	

}

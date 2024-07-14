package com.example.sample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sample_table")
public class SampleModel {

	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "mobile")
	private int mobile;

	@Column(name = "age")
	private int age;

}

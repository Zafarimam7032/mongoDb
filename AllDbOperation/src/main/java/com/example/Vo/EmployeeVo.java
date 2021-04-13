package com.example.Vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeVo {
	@Id
	private int id;
	private String name;
	private String city;
	private double salary;
	private String company;
	

}

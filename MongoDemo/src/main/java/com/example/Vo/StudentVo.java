package com.example.Vo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class StudentVo {
	@Id
	private int id;

	private String name;
	private String city;
	private String collegeName;
	private String mobileNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", name=" + name + ", city=" + city + ", collegeName=" + collegeName
				+ ", mobileNumber=" + mobileNumber + "]";
	}

	public StudentVo(int id, String name, String city, String collegeName, String mobileNumber) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.collegeName = collegeName;
		this.mobileNumber = mobileNumber;
	}

	public StudentVo() {
		super();
	}

}

package com.smart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "jpa-laptop")
public class Laptop {
	
	@Id
	private int id;
	private String modelnumber;
	private String brand;
	
	@OneToOne
	@JoinColumn(name = "studentid")
	private Student student;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelnumber() {
		return modelnumber;
	}
	public void setModelnumber(String modelnumber) {
		this.modelnumber = modelnumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}

package com.bmj.test.model;

import java.util.List;

public class Result {

	private Double totalHours;
	private List<Course> courses;
	
	
	public Double getTotalHours() {
		return totalHours;
	}
	public void setTotalHours(Double totalHours) {
		this.totalHours = totalHours;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Result(Double totalHours, List<Course> courses) {
		super();
		this.totalHours = totalHours;
		this.courses = courses;
	}
	
	
	
}

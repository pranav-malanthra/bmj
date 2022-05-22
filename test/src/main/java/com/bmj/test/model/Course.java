package com.bmj.test.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
	
	private Double time;
	private String title;
	
	
	public Double getTime() {
		return time;
	}
	public void setTime(Double time) {
		this.time = time;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Course(@JsonProperty("time") Double time,@JsonProperty("title") String title) {
		super();
		this.time = time;
		this.title = title;
	}
	
	

}

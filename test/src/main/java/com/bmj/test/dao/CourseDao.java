package com.bmj.test.dao;

import java.util.List;

import com.bmj.test.model.Course;

public interface CourseDao {
	
	public List<Course> getCourseDetails(String text);

}

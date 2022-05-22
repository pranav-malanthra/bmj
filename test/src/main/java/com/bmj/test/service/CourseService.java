package com.bmj.test.service;

import java.util.List;

import com.bmj.test.model.Course;
import com.bmj.test.model.Result;

public interface CourseService {
	
	public List<Course> getCourseDetails(String text);

	public Result getCourseDetailsWithHours(String text);

}

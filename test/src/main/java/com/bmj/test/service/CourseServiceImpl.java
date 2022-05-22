package com.bmj.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmj.test.dao.CourseDao;
import com.bmj.test.model.Course;
import com.bmj.test.model.Result;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> getCourseDetails(String text) {
		// TODO Auto-generated method stub
		return courseDao.getCourseDetails(text);
	}
	
	@Override
	public Result getCourseDetailsWithHours(String text) {
		List<Course> courses = courseDao.getCourseDetails(text);
		Result result;
		double totalHours = 0;
		for(Course course: courses) {
			if(null != course.getTime())
				totalHours += course.getTime();
		}
		
		result = new Result(totalHours, courses);
		return result;
	}

}

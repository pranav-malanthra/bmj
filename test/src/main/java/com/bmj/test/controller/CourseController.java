package com.bmj.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bmj.test.model.Course;
import com.bmj.test.model.Result;
import com.bmj.test.service.CourseService;

@RequestMapping("api/bmj")
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/course", method = RequestMethod.GET)
	public List<Course> getCourseDetails(@RequestParam("text") String text){
		return courseService.getCourseDetails(text);
	}
	
	@RequestMapping(value="/courseHours", method = RequestMethod.GET)
	public Result getCourseDetailsWithHours(@RequestParam("text") String text){
		return courseService.getCourseDetailsWithHours(text);
	}
	

}

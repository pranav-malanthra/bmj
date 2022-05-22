package com.bmj.test.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bmj.test.model.Course;

@Repository
public class CourseDaoImpl implements CourseDao{

	private  List<Course> courseDB = new ArrayList<Course>();
	
	
	public CourseDaoImpl() {
		Double d = new Double(5);
		Course c1 = new Course(new Double(5),"Introduction to mechanical ventilation");
		Course c2 = new Course(3.5,"Introduction to coronavirus disease 2019 (COVID-19)");
		Course c3 = new Course(new Double(2),"Clinical pointers: COVID-19 in primary care");
		Course c4= new Course(new Double(1),"Clinical pointers: remote consultations in primary care");
		Course c5 = new Course(null,"Quick tips: introduction to asthma");
		Course c6 = new Course(new Double(10.25),"Infection control - including basic personal protective equipment");
		Course c7 = new Course(new Double(7.5),"Introduction to testing for COVID-19");
		Course c8 = new Course(new Double(2),"Airways management: tracheal intubation");
		Course c9 = new Course(new Double(2.5),"Quick tips: proning in critical care");
		Course c10 = new Course(new Double(3),"Quick tips: introduction to asthma");
		
		courseDB.add(c1);
		courseDB.add(c2);
		courseDB.add(c3);
		courseDB.add(c4);
		courseDB.add(c5);
		courseDB.add(c6);
		courseDB.add(c7);
		courseDB.add(c8);
		courseDB.add(c9);
		courseDB.add(c10);
	}
	
	@Override
	public List<Course> getCourseDetails(String text) {
		List<Course> filteredList = new ArrayList<Course>();
		for(Course course: courseDB) {
			if(course.getTitle().contains(text))
				filteredList.add(course);
		}
		return filteredList;
	}

	
}

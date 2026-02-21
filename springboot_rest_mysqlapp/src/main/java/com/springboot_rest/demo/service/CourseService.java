package com.springboot_rest.demo.service;

import java.util.List;

import com.springboot_rest.demo.binding.Course;

public interface CourseService {
	
	public String upsert(Course course);
	
	public  Course getById(Integer id);
	public List<Course> getAllCourses();
	public String deleteById(Integer id);

}


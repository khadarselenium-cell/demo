package com.springboot_rest.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot_rest.demo.binding.Course;
import com.springboot_rest.demo.service.CourseService;

public class Courserestcontroller {
	
	private CourseService courseservice;
	@PostMapping("/course")
	public ResponseEntity<String> createCourse(@RequestBody Course course){
		String status = courseservice.upsert(course);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getcourse(@PathVariable Integer id){
		Course course = courseservice.getById(id);
		return new ResponseEntity<>(course,HttpStatus.OK);
		
	}
	@GetMapping("/course")
	public ResponseEntity<List<Course>>getAllCourses(){
		List<Course> allCourses = courseservice.getAllCourses();
		return new ResponseEntity<>(allCourses,HttpStatus.OK);
	}
	@PutMapping("/course")
	public ResponseEntity<String> updateCourse(@RequestBody Course course){
		String status = courseservice.upsert(course);
		return new ResponseEntity<>(status,HttpStatus.OK);
}
	@DeleteMapping("/course/{id}")
	public ResponseEntity<Course> deletecourse(@PathVariable Integer id){
		String status = courseservice.deleteById(id);
		return new ResponseEntity<>(status,HttpStatus.OK);
}
}

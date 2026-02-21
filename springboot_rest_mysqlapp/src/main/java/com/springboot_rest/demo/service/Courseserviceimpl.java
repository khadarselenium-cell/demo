package com.springboot_rest.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot_rest.demo.binding.Course;
import com.springboot_rest.demo.repository.Courserepository;

@Service
public  class Courseserviceimpl implements CourseService {
	
	@Autowired
	private Courserepository courserepo;

	@Override
	public String upsert(Course course) {
		courserepo.save(course);
		return "success";
	}

	@Override
	public Course getById(Integer id) {
		Optional<Course> findById=courserepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courserepo.findAll(); 
		
	}
	@Override
	public String deleteById(Integer id) {
		if(courserepo.existsById(id)) {
			courserepo.deleteById(id);
			return "Delete Success";
		}else {
			return "record not found";
		}
			
	}
}
	



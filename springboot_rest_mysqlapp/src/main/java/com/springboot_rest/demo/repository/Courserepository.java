package com.springboot_rest.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_rest.demo.binding.Course;

@Repository
public interface Courserepository extends JpaRepository<Course,Serializable>{

}

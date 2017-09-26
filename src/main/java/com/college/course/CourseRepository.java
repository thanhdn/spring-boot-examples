package com.college.course;

import org.springframework.data.repository.CrudRepository;

import com.college.to.Course;

public interface CourseRepository extends CrudRepository<Course, String> {

}

package com.college.course;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.college.to.Course;

@Controller
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@GetMapping("/register-course")
    public String viewCourse(Model model) {
        return "register_course";
    }

    @PostMapping("/register-course")
    public String addCourse(HttpServletRequest req) {
    	Course course = new Course();
        course.setCourseId(Long.valueOf(req.getParameter("courseId")));
        course.setCourseName(req.getParameter("courseName"));
    	courseRepository.save(course);
    	req.setAttribute("course", course);
        return "result";
    }
    
    @GetMapping("/view-all-course")
    public String getCourse(Model request) {
    	Iterator<Course> courseIterator = courseRepository.findAll().iterator();
    	List<Course> courseLst = new ArrayList<Course>();
    	if(courseIterator != null) {
    		courseIterator.forEachRemaining(courseLst::add);
    	}
    	request.addAttribute("listCourses", courseLst);
    	return "view_all_course";
    }
}

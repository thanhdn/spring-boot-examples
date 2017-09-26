package com.college.course;

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
        model.addAttribute("course", new Course());
        return "register_course";
    }

    @PostMapping("/register-course")
    public String addCourse(@ModelAttribute Course course) {
    	courseRepository.save(course);
        return "result";
    }
    
    @GetMapping("/view-all-course")
    public String getCourse() {
    	courseRepository.findAll();
    	return "view_all_course";
    }
}

package br.luccademichei.trabalhoengswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.luccademichei.trabalhoengswii.beans.Course;
import br.luccademichei.trabalhoengswii.beans.CourseRegister;

@RestController
public class CourseRetrieveController {
	@GetMapping("/course/allcourse")
	public List<Course> getAllCourses() {
		return CourseRegister.getInstance().getCourseList();
	}

}

    


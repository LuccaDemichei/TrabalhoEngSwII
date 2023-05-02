package br.luccademichei.trabalhoengswii.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.luccademichei.trabalhoengswii.beans.*;

@RestController
public class CourseRegistrationController {
    @PostMapping("register/course")
    public CourseRegisterReply registerCourse(@RequestBody Course course){
        System.out.println("In course register...");
        CourseRegisterReply curseregreply = new CourseRegisterReply();
        CourseRegister.getInstance().add(course);

        curseregreply.setCodCourse(course.getCodCourse());
        curseregreply.setDescription(course.getDescription());
        curseregreply.setCodClass(course.getCodClass());
        curseregreply.setRegister(course.getRegister());

        return curseregreply;
    }
    
}

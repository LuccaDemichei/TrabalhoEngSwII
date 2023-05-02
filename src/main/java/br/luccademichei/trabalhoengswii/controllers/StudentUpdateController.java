package br.luccademichei.trabalhoengswii.controllers;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.luccademichei.trabalhoengswii.beans.Student;
import br.luccademichei.trabalhoengswii.beans.StudentRegistration;

@RestController
public class StudentUpdateController {
	@PutMapping("/update/student")
	public String updateStudentRecord(@RequestBody Student stdn) {
		System.out.println("In updateStudentRecord");   
		return StudentRegistration.getInstance().upDateStudent(stdn);
	}

}

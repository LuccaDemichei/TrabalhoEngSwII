package br.luccademichei.trabalhoengswii.beans;

import java.util.ArrayList;
import java.util.List;

public class CourseRegister {
    private List<Course> courseList;

    private static CourseRegister cursereg = null;

    
    private CourseRegister(){
        courseList = new ArrayList<Course>();
    }

    public static CourseRegister getInstance(){
		if(cursereg == null) {
            cursereg = new CourseRegister();
			return cursereg;
		}
		else {
			return cursereg;
		}
    }

    public void add(Course d){
        boolean check = false;
        for(Course c : courseList){
            check = check || (c.getCodCourse().equalsIgnoreCase(d.getCodCourse()));
        }
        if(check == false){
            courseList.add(d);
            d.setRegister("Successful");

        } else{
            d.setRegister("Register un-successful - CodeCourse already registered");
            System.out.println("Register un-successful - CodeCourse already registered");
        } 
    }

    public List<Course> getCourseList() {
		return courseList;
	}

}

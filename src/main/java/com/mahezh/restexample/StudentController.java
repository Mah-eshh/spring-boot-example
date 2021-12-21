package com.mahezh.restexample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//http://localhost:8080
	@GetMapping("/student")
	public Student getOneStudent () {
		return new Student("Mahesh","Abeykoon");
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Mahesh1", "Abey1"));
		students.add(new Student("Mahesh2", "Abey2"));
		students.add(new Student("Mahesh3", "Abey3"));
		students.add(new Student("Mahesh4", "Abey4"));
		
		return students;
	}
	
	@GetMapping("student/{firstName}/{lastName}/")
	public Student studentPathVariable (@PathVariable("firstName")String firstName, 
			@PathVariable("lastName") String lastName) {
		
		return new Student(firstName, lastName);
	}
	 
	//http://localhost:8080/student/query?firstName=Mahesh&lastName=Abeykoon
	//API to handle query parameters
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam(name ="firstName") String firstName, 
			@RequestParam(name ="lastName")  String lastName) {
		return new Student (firstName, lastName);
		
	}
}

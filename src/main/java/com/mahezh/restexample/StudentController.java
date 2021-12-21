package com.mahezh.restexample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//http://localhost:8080
	@GetMapping("/student")
	public Student getOneStudent () {
		return new Student("Mahesh","Abeykoon");
	}
	
	
	 
}

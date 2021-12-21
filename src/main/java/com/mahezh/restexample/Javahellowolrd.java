package com.mahezh.restexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Javahellowolrd {

	@GetMapping("/helo-world")
	public String hellowWorld () {
		return "It is working!...";
	}
}

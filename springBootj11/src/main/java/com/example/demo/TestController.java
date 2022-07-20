package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.UserData;

@RestController
public class TestController {
	
	private UserData studentData;
	
	@GetMapping(value = "/test")
	public String test() {
		return "TEST OK";
	}
	
	@GetMapping(value = "/student/get") // test student no.
	public UserData getStudent() {
		studentData = new UserData();
		// test data
		studentData.setName("John");
		studentData.setAge(25);
		return studentData;
	}
	

}

package com.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.LoginData;

@RestController
public class EmployeeController 
{

		@GetMapping("/HelloWorld")
		public String HelloWorld() {
			return "Hello World";
		}
		
		@PostMapping("/loginCriedentials")
		public void login(@RequestBody LoginData loginRequest)
		{
			System.out.println("Username : "+ loginRequest.getUsername());
			System.out.println("Password : " +loginRequest.getPassword());
			
		}
}

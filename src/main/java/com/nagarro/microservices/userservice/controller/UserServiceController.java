package com.nagarro.microservices.userservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/user")
public class UserServiceController {

	
	
	
	
	
	@RequestMapping("/test")
	public String getOrderTest() {
		
		return "success";
	}

	
	
	
	

}


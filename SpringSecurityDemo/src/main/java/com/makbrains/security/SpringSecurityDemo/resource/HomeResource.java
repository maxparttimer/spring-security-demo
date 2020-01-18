package com.makbrains.security.SpringSecurityDemo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String getMessage() {
		return "<h1>Welcome!!!</h1>";
	}
	
	@GetMapping("/user")
	public String getUserMessage() {
		return "<h1>Welcome USER are authenticated!!!</h1>";
	}
	
	
	@GetMapping("/admin")
	public String getAdminMessage() {
		return "<h1>Welcome ADMIN are authenticated!!!</h1>";
	}
}

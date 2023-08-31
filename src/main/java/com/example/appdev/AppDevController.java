package com.example.appdev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppDevController {
	
	@GetMapping(value="/hi")
	public String getThis() {
		return "GEM.KRALICE";
	}

}

package com.example.appdev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppDevController {
	
	@GetMapping(value="/deyyy")
	public String getThis() {
		return "PAAL DABBAA SERIOUSLY VERY NICE HAIR CUT DEYY ~ KISS EMOJI VERA ILA SO TAKE IT THIS UMMMAAA EEEEEE";
	}

}

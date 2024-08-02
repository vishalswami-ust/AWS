package com.iiht.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	
	@GetMapping("/greet")
	public String Message() {
		return "Niraj from UST Gonna Win Olympic Medal";
	}
}

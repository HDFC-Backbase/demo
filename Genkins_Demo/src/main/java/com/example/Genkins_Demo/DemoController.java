package com.example.Genkins_Demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping(value="/upload")
    public String getData() {
		return "Hello Deepti";
    	
    }
}

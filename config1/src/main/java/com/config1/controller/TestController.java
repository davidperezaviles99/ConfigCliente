package com.config1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${some.value}")
	private String myvalue;
	
	@GetMapping(path="/myValue")
	public String myValue() {
		return this.myvalue;
	}
}

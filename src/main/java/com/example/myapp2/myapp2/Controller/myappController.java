package com.example.myapp2.myapp2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myappController {
	

	//RequestMapping
	@RequestMapping(value = "/myapp2", method = RequestMethod.GET,produces = {"application/json"})
	public String myMethod() {
		return " App2 Mapping ";
	}
	

}

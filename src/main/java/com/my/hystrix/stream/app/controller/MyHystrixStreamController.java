package com.my.hystrix.stream.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.my.hystrix.stream.app.service.MyBookImplementation;

@RestController
public class MyHystrixStreamController {
	
	@Autowired
	private MyBookImplementation myBookImplementation;
	
	@RequestMapping(value="/book", produces="application/json", method=RequestMethod.GET)
	public String getBookName(){
		
		return myBookImplementation.getBookName();
	}
	
}

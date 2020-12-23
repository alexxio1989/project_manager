package com.ws.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/router")
public class CoreController {

	@CrossOrigin("*")
	@RequestMapping(value = "/enable" ,  produces = "application/json",  method = RequestMethod.GET)
	public boolean enableProject() {
		return false;
	}
}

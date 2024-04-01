package com.springannot.springannot.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/home")
public class PageController {

	@RequestMapping
	//@ResponseBody
	public List<String> home() {
		System.out.println("Home Page");
		return List.of("Roy","Jane","Ricky");
	}
}

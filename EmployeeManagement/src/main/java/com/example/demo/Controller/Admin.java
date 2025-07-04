package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin {
	@GetMapping("/add")
	public String addAdmin()
	{
		return "aaaaa";
	}

}

package com.locationweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
	
	@RequestMapping("/showLocationPage")
	public String showLocationPage() {
		return "create_location";
	}
}

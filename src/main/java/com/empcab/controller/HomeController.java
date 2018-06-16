package com.empcab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	/**
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "forward:home.html";
	}

}

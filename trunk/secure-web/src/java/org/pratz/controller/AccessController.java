package org.pratz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccessController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping(value = "/logout")
 	public String logout() {
		return "login";
	}
}
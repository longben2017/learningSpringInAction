package com.learningSpring.chap5.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {

	@RequestMapping(method=GET)
	public String home(){
		return "home";
	}
}

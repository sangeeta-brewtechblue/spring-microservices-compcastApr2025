package com.sj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/hello")
public class HelloController {
	
	           @RequestMapping("/hi")
	           public ModelAndView sayHello() {
	        	   
	        	   ModelAndView mnv = new ModelAndView("success","msg","Hello World...");
	        	   
	        	   return mnv;
	           }
	
	
	

}

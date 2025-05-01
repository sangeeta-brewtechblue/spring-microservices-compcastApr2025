/**
 * 
 */
package com.sj.mvc.webapp.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sange
 *
 */
@Controller
@RequestMapping("/web")
public class MVCController {
	@RequestMapping("/hi")
	public String sendMessage() {
		
		return "hello world";
		
	}
	

}

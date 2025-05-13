/**
 * 
 */
package com.sj.forex.forex_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.forex.forex_service.ForexRepository;
import com.sj.forex.forex_service.service.ExchangeValue;

/**
 * @author sange
 *
 */
@RestController
@RequestMapping("/rest")
public class ForexController {
	@Autowired
	ForexRepository repo;
	
	@GetMapping("/exchangevalues/{from1}")
	public ExchangeValue getForexRate(@PathVariable String from1) {
		   System.out.println(from1);
		 return    repo.getByFrom1(from1).get(0);
		
	}

}

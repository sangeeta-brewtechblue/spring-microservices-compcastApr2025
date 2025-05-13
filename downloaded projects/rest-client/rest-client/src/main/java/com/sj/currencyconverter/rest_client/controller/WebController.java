/**
 * 
 */
package com.sj.currencyconverter.rest_client.controller;

import java.math.BigDecimal;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sj.currencyconverter.rest_client.model.ExchangeValue;

/**
 * @author sange
 *
 */
@RestController
@RequestMapping("/api")
public class WebController {
	@GetMapping("/hi")
	public String sayHi() {
		return "Hello world";
	}
	
	@GetMapping("/rates/{f}/{amt}")
	public double getConvertedAmount(@PathVariable String f,@PathVariable double amt ) {
		System.out.println(f);
		RestTemplate template= new RestTemplate();
		ExchangeValue ev = template.getForObject("http://localhost:8080/rest/exchangevalues/"+f,  
				ExchangeValue.class );
		BigDecimal rate =ev.getConversionMultiple();
		double r= Double.valueOf(rate.toString());
		return r * amt;
		
		
	}
	
	

}

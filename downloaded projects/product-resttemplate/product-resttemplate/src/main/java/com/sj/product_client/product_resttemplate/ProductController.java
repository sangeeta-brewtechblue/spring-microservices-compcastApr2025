/**
 * 
 */
package com.sj.product_client.product_resttemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author sange

 *
 */
@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/products")
	public Product[] getAllProducts(){
		
		ResponseEntity<Product[]> products = 
		
		restTemplate.getForEntity("http://localhost:8080/api/version1/products",Product[].class);
		
	    return  products.getBody();
	
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product p) {
		System.out.println("here"+p);
	
		ResponseEntity<Product> entity =
		
		restTemplate.postForEntity("http://localhost:8080/api/version1/product",p,Product.class);
		
		return entity.getBody();
		
		
	}
	
	

}

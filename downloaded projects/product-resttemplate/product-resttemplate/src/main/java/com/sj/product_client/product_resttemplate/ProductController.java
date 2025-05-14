/**
 * 
 */
package com.sj.product_client.product_resttemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
		 int pid = id;
		 Map<String,Integer> params =new HashMap<String,Integer>();
		 params.put("id", pid);
		ResponseEntity<Product> productEntity=
		restTemplate.getForEntity("http://localhost:8080/api/version1/product/{id}", Product.class,params);
		return productEntity.getBody();
	
	}
	
	
	@PutMapping("/products/{id}")
	public String updateProduct(@PathVariable int id, @RequestBody Product toBeUpdated) {
		
		  restTemplate.put("http://localhost:8080/api/version1/products/"+id, toBeUpdated);
	
	           return "product updated";
	}
	
	@DeleteMapping("/products/{id}")
	public String deleteProduct(@PathVariable int id){
		 int pid = id;
		 Map<String,Integer> params =new HashMap<String,Integer>();
		 params.put("id", pid);
		
		restTemplate.delete("http://localhost:8080/api/version1/products/{id}", params);
		return "deleted product";
	}
	
	
	
	

}

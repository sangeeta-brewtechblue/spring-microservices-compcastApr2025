/**
 * 
 */
package com.sj.rest.car_demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.rest.car_demo.dao.BookDAO;
import com.sj.rest.car_demo.model.Book;

/**
 * @author sange
 *
 */
@RestController
@RequestMapping("/api")
public class WebController {
	@Autowired
	@Qualifier("bookdao")
	BookDAO bookDao;
	
	@GetMapping("/greet")
	public String sayHello() {
		
		return "Hello world";
		
	}
	
	@GetMapping("/cars")
	public List<String> getAllCars(){
		List<String> cars = new ArrayList<>();
		cars.add("Merc");
		cars.add("ECreta");
		cars.add("I20");
		
		return cars;
		
	}
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable int id){
		System.out.println("id"+id);
		return bookDao.getBookById(id);
		
	}
	@GetMapping("/books")
	public Set<Book> getAllBooks(){
		System.out.println("getAll");
		return bookDao.viewAllBooks();
		
	}
	
	@GetMapping("/books/name/{name}")
	public Book getByName(@PathVariable String name){
		    System.out.println(name);
		  return   bookDao.viewByname(name).get();
	}
	
	

}

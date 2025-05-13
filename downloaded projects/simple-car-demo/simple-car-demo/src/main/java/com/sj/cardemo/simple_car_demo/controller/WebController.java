/**
 * 
 */
package com.sj.cardemo.simple_car_demo.controller;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.cardemo.simple_car_demo.repo.CarRepo;
import com.sj.cardemo.simple_car_demo.service.model.Car;
/**
 * @author sange
 *
 */

@RestController
@RequestMapping("/api")
public class WebController {
	 @Autowired
	 CarRepo carRepo;
	
	 @GetMapping("/greetings")
	 public String sayHello() {
		 return "Hello world...";
	 }
	
	 @GetMapping("/cars")
	 public Set<Car> getAllCars(){
		 
		return carRepo.getCars();
		 
	 }
	 
	 @GetMapping("/cars/{id}")
	 public Car getCarById(@PathVariable int id) {
		 
		 return carRepo.findCarById(id);
	 }
	 
	 @PostMapping("/cars")
	 public Car insertCar(@RequestBody Car car) {
		 
		 return carRepo.addNewCar(car);
		 
	 }
	 
	 @PutMapping("/cars")
	 public Set<Car> updateCar(@RequestBody Car car) {
		 return carRepo.updateCar(car);
	 }
	 
	 @DeleteMapping("/cars/{id}")
	 public String deleteCar( @PathVariable int id) {
		 carRepo.deleteCar(id);
		 return "deleted successfully";
	 }

}

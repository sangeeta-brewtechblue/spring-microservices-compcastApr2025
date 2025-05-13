/**
 * 
 */
package com.sj.carapp.carapplication.controller;
import java.util.List;
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

import com.sj.carapp.carapplication.service.CarService;
import com.sj.carapp.carapplication.service.model.Car;


/**
 * @author sange
 *
 */

@RestController
@RequestMapping("/api")
public class WebController {
	 @Autowired
	 CarService carService;
	 @GetMapping("/greetings")
	 public String sayHello() {
		 return "Hello world...";
	 }
	
	 @GetMapping("/cars")
	 public List<Car> getAllCars(){
		 
		return carService.getAllCars();
		 
	 }
	 
	 @GetMapping("/cars/{id}")
	 public Car getCarById(@PathVariable int id) {
		 
		 return carService.getCarById(id);
	 }
	 
	 @GetMapping("/cars/models/{model}")
	 public List<Car> getCarsByModel(@PathVariable String model){
			
			return carService.getCarsByModel( model);
			
		}
	 
	 @GetMapping("/cars/colours/{colour}")
	 public List<Car> getCarsByColour(@PathVariable String colour){
			
			return carService.getCarsByColour( colour);
			
		}	 
	 
	 @PostMapping("/cars")
	 public Car insertCar(@RequestBody Car car) {
		 
		 return carService.insertCar(car);
		 
	 }
	 
	 @PutMapping("/cars/{id}")
	 public Car updateCar(@RequestBody Car car,@PathVariable int id) {
		 return carService.updateCar(car,id);
	 }
	 
	 @DeleteMapping("/cars/{id}")
	 public List<Car> deleteCar( @PathVariable int id) {
		 return  carService.deleteCar(id);
		 
	 }

}

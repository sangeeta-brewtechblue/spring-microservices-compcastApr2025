/**
 * 
 */
package com.sj.cardemo.simple_car_demo.service.model;

import java.util.Objects;

import org.springframework.stereotype.Component;

/**
 * @author sange
 *
 */
@Component
public class Car implements Comparable<Car>{
	private int id;
	private String colour;
	private String model;
	
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", colour=" + colour + ", model=" + model + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, id, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(colour, other.colour) && id == other.id && Objects.equals(model, other.model);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String colour, String model) {
		super();
		this.id = id;
		this.colour = colour;
		this.model = model;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	
	

}

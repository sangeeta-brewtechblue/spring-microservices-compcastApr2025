/**
 * 
 */
package com.sj.model;

/**
 * @author sangeeta
 *
 */
public class Greet {
	
	String message;
	
		

	public Greet() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("instantiated");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("invoked by spring");
		this.message = message;
	}
	
	public void sayHello() {
		
		System.out.println("Hello..."+message);
		
	}
	

}

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
	
		

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sayHello() {
		
		System.out.println("Hello..."+message);
		
	}
	

}

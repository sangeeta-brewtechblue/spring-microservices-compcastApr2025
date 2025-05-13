/**
 * 
 */
package com.sj.model;

/**
 * @author sange
 *
 */
public class HelloBean {
	
 private String message ;
 
 
    public void sayHello() {
    	System.out.println("Welcome!"+ message);
    }
 

public HelloBean() {
	super();
	// TODO Auto-generated constructor stub
}

public HelloBean(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
 

}

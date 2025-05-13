package com.sj.framewor;

import com.sj.client.User;
import com.sj.model.Calculator;
import com.sj.model.CalculatorA;
import com.sj.model.CalculatorB;

public class SpringFr {

	public static void main(String[] args) {//throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		   
		
	       User user = new User();
	       
	       Calculator c = null;
	       
		if(args[0].equals("A"))
	    	   c = new CalculatorA();
		else
			   c= new CalculatorB();
	
	    user.setC(c);
	    
	    user.invokeSqrroot(13);
	
	}

}

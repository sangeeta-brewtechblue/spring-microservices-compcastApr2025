package com.sj;

public class DIFramework {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       DIFramework f1 = new DIFramework();
	      // f1.injectDependency(args[0]);
	       
	       
	       
	        Calculator c =null;
	        if(args[0].equals("A"))
				c = new CalculatorA();
			else
				c = new CalculatorB();
	        User u  = new User();
	       
			
			u.setCalc(c);
			u.invokeFindSqrrt(13);
	
	       
	
	}
	
	
}

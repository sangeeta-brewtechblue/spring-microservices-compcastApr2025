/**
 * 
 */
package com.sj;

/**
 * @author sangeeta
 *
 */
public class User1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using new keyword..need to change java code to change service provider
	   Calc c1 = new CalcA();
	   
	   c1.calculate();
	
	   // using factory pattern..explicit request ..service locator pattern
	   Calc c2 = CalcFactory.getCalc("A");
	
	   c2.calculate();
	
	   
	     
	   
	   
	   
	   
	
	
	}

}

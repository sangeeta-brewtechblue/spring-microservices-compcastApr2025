package com.sj.model;

public class CalculatorA implements Calculator{

	@Override
	public void findSqrRoot(double x) {
		// TODO Auto-generated method stub
		    
		double result =Math.sqrt(x);
		
	       System.out.println("A calculating sqrrt. The result is:" + result);	
		
	}

}

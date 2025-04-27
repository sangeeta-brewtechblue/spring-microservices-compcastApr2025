package com.sj;

public class User {
	 Calculator calc;

	
	 public void setCalc(Calculator c) {
		 this.calc = c;
	 }
	
	 public void invokeFindSqrrt(int x) {		 
		 
		 calc.findSqrRoot(x);
	 }
}	
	


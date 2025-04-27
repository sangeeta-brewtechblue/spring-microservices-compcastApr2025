package com.sj;

public class CalcFactory {



    public static Calc getCalc(String name) {
    	
    	if(name.equals("A")) {
    		return new CalcA();
    	}
    	if(name.equals("B")) {
    		return new CalcB();
    	}
    	
    	return null;
    	
    }



}

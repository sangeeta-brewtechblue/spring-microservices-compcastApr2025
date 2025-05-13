/**
 * 
 */
package com.sj.client;

import com.sj.model.Calculator;
import com.sj.model.CalculatorA;
import com.sj.model.CalculatorB;

/**
 * @author sange
 *
 */
public class User {
	Calculator c;

	/**
	 * @param args
	 */
		
	public void invokeSqrroot(int x) {
		c.findSqrRoot(x);
	}

	public Calculator getC() {
		return c;
	}

	public void setC(Calculator c) {
		this.c = c;
	}

}

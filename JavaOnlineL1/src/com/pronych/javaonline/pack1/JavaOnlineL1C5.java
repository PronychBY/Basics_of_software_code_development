package com.pronych.javaonline.pack1;

import java.math.BigInteger;

public class JavaOnlineL1C5 {

	public static void main(String[] args) {
		//initialization
		double e = 0.001;
		//logic
		double result = 0;
		int i = 0;
		double a = 0;
		while (i==0 || a>=e) {
			i++;
			a = Math.abs(1/Math.pow(2, i)+1/Math.pow(3, i));
			result = result + a;
		}	
		System.out.print(result);
	}

}

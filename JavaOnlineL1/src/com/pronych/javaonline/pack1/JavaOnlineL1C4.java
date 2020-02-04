package com.pronych.javaonline.pack1;

import java.math.BigInteger;

public class JavaOnlineL1C4 {

	public static void main(String[] args) {
		//initialization
		int numberOfDigits = 20;
		//logic
		BigInteger result = BigInteger.valueOf(1);;
		for(int i = 1; i<numberOfDigits; i++) {
            result = result.multiply(BigInteger.valueOf(i * i));
		}	
		System.out.print(result);
	}

}

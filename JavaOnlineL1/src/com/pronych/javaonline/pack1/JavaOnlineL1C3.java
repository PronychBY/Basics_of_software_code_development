package com.pronych.javaonline.pack1;

public class JavaOnlineL1C3 {

	public static void main(String[] args) {
		//initialization
		int numberOfDigits = 100;
		//logic
		int result = 0;
		for(int i = 0; i<numberOfDigits; i++) {
			result = result + i * i;
		}	
		System.out.print(result);
	}

}

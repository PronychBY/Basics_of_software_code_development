package com.pronych.javaonline.pack1;

public class JavaOnlineL1C8 {

	public static void main(String[] args) {
		//initialization
		int a=125;
		int b=2590;

		//logic

        String stringB = String.valueOf(a);
        char[] arrayB = stringB.toCharArray();
        
        String stringA = String.valueOf(b);
        char[] arrayA = stringA.toCharArray();
        
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
            	if (arrayA[i] == arrayB[j]) {
            		System.out.println(arrayA[i]);
            	}
            }
		}
	}

}

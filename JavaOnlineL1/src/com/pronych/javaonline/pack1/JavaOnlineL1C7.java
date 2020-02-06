package com.pronych.javaonline.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaOnlineL1C7 {

	public static void main(String[] args) {
		//initialization
		int m=0;
		int n=0;
		
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("¬ведите число m:");
        	m = Integer.parseInt(consoleReader.readLine());
            System.out.print("¬ведите число n:");
        	n = Integer.parseInt(consoleReader.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }		

		//logic
		for (int i = m; i < n; i++) {
			System.out.print(i+":");
			for (int j = i-1; j>1; j--) {
				if (i % j == 0) {
					System.out.print(" "+j);
				}
			}
			System.out.println();
		}
	}

	
	
	
}

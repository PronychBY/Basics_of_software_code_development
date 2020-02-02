package com.pronych.javaonline.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaOnlineL1C1 {

	public static void main(String[] args) {
		//initialization
		int x=0;
		
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите число:");
        	x = Integer.parseInt(consoleReader.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }		

		//logic
		int rezult = 0;
		for (int i = 1; i < x; i++) {
			rezult = rezult + i;
		}
		
		System.out.print("Результат вычисления:");
		System.out.println(rezult);
		

	}

}

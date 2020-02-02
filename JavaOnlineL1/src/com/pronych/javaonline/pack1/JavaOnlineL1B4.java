package com.pronych.javaonline.pack1;

public class JavaOnlineL1B4 {
	public static void main(String[] args) {
		//initialization
		int a = 10;
		int b = 5;
		
		int x = 5;
		int y = 6;
		int z = 10;
		
		//logic
		if ( (a >= x && b >= y) || (a >= x && b >= z) || (a >= y && b >= z) 
				|| (b >= x && a >= y) || (b >= x && a >= z) || (b >= y && a >= z)
				) {
			System.out.println("Влезет.");
		}
		else {
			System.out.println("Не влезет.");
		}
	}

}

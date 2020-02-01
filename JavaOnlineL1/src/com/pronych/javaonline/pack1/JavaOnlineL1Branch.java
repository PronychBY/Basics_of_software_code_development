package com.pronych.javaonline.pack1;

public class JavaOnlineL1Branch {

	public static void main(String[] args) {
		//initialization
		int angle1 = 30;
		int angle2 = 60;
		//logic
		if (isTriangleExist(angle1, angle2)) {
			System.out.println("Tiangle exist.");
			if (isTriangleRectangular(angle1, angle2)) {
				System.out.println("Tiangle rectangular.");
			}
		}
		else {
			System.out.println("Tiangle does not exist.");
		}
	}
	private static boolean isTriangleExist(int angle1, int angle2) {
		return (angle1+angle2)<180;
	}
	private static boolean isTriangleRectangular(int angle1, int angle2) {
		return (angle1 == 90 || angle2 == 90 || (180-angle1-angle2) == 90);
	}
}

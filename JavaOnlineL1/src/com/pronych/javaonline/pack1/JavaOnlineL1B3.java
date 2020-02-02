package com.pronych.javaonline.pack1;

public class JavaOnlineL1B3 {

	public static void main(String[] args) {
		//initialization
		Point point1 = new Point(1,1);
		Point point2 = new Point(3,3);
		Point point3 = new Point(5,5);
		//logic
		if ((point1.getX() - point3.getX())*(point2.getY() - point3.getY()) 
				- (point2.getX() - point3.getX())*(point1.getY() - point3.getY()) == 0) {
			System.out.println("Точки находятся на одной прямой.");
		}
		else {
			System.out.println("Точки не находятся на одной прямой.");
		}
	}

}

package com.pronych.javaonline.pack1;

import java.util.ArrayList;
import java.util.List;

public class JavaOnlineL1C2 {

	public static void main(String[] args) {
		//initialization
		double a = -2.0;
		double b = 5.0;
		double h = 0.2;
		//logic
		System.out.print(getFValue(a, b, h));
	}
	
	private static List<Double> getFValue(double a, double b, double h){
		List<Double> result = new ArrayList<>();
		for (double x = a; x < b; x=x+h) {
			result.add(x>2?x:-x);
		}
		return result;
	}
}

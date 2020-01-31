package com.pronych.javaonline.pack1;

public class Pack1 {
	//---hardcode all input data
	
	public static void task1() {
		//initialization
		int a = 3;
		int b = 2;
		int c = 8;
		
		//logic
		double result = ((a-3)*b/2)+c; 
		
		System.out.println("((a-3)*b/2)+c="+result);
	}
	
	public static void task2() {
		//initialization
		double a = 3;
		double b = 2;
		double c = 8;
		
		//logic
		double result = 
			(b+Math.sqrt(b*b+4*a*c))/ 
			2*a - a*a*a*c+Math.sqrt(b); 
		
		System.out.println("result test2="+result);
	}
	
	public static void task3() {
		//initialization
		double x = 3;
		double y = 2;
		
		//logic
		double result = 
			(Math.sin(x)+Math.cos(y))/ 
			(Math.cos(x)-Math.sin(y))*Math.tan(x*y); 
		
		System.out.println("result test3="+result);
	}
	
	public static void task4() {
		//initialization
		double r = 111.222;
		
		//logic
		double nnn = Math.floor(r);
		double ddd = Math.round((r-nnn)*1000);
		double result = ddd + nnn/1000; 
		
		System.out.println("result test4="+result);
	}
	
	public static void task5() {
		//initialization
		int T = 11111;
		
		//logic
		int hours = Math.round(T/3600);
		int minutes = Math.round(T/60)-hours*60;
		int seconds = T-minutes*60-hours*3600;
		
		System.out.println("result test5="+hours+"ч "+minutes+"мин "+seconds+"с.");
	}
	
	public static void task6() {
		//initialization
		Parallelogram parallelogram1 = new Parallelogram(new Point(-2,0), new Point(2,2));
		Parallelogram parallelogram2 = new Parallelogram(new Point(-4,-3), new Point(4,0));
		
		Point point = new Point(0,-1);
		//logic
		System.out.println(parallelogram1.isPointInParallelogram(point)||parallelogram2.isPointInParallelogram(point));
		
	}
	
	public static void main(String[] args) {
		//task1();
		//task2();
		//task3();
		//task4();
		//task5();
		task6();
	}

}

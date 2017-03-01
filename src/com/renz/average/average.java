package com.renz.average;
/*
 * @Jayson Mallari
 */
public class average {
	
	public static void main(String[] args){
		System.out.println("The average of three integers  99, 88, and 75 is : " +
				average(99,88,75));
		
		System.out.println("The average of three doubles  99.00, 88.00, and 75.00 is : " +
				average(99.00,88.00,75.00));
	}
	
	public static double average(int a, int b, int c){
		return (a + b + c)/ 3.0;
	}
	
	public static double average(double a, double b, double c){
		return (a + b + c)/ 3;
	}
	

}

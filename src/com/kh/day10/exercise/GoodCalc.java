package com.kh.day10.exercise;

public class GoodCalc extends Calculator {
	
	public static void main(String [] args) {
		int [] a = {10, 9, 8, 7, 4};
		GoodCalc calc = new GoodCalc();
		System.out.println("Че : " + calc.add(5, 4));
		System.out.println("Тї : " + calc.substract(10, 1));
		System.out.println("ЦђБе : " + calc.average(a));
	}

	@Override
	public int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	@Override
	public int substract(int a, int b) {
		
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum/(double)a.length;
		return avg;
	}
}
		
//		int [] a = {1, 2, 3, 4, 7};
//		System.out.println("Че: " + calc.add(1, 2));
//		System.out.println("Тї: " + calc.substract(2, 1));
//		System.out.println("ЦђБе : " + calc.average(a));
//	}
//
//	@Override
//	public int add(int a, int b) {
//		int result = a + b;
//		return result;
//	}
//
//	@Override
//	public int substract(int a, int b) {
//		return a-b;
//	}
//
//	@Override
//	public double average(int [] a) {
//		//{1, 2, 3} -> {1, 2, 3, 4, 5}
//		int sum = 0;
//		for(int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//			double avg = sum/(double)a.length;
//			return avg;
//	}
//}

package com.kh.day02.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 1 + 2, 2 x 3, 4 / 2
		// 단항연산자, 이항연산자
		// a++, a--, b++, b--
		// a = a + 1, a = a - 1, b = b + 1, b = b - 1
		//int  a = 1;
		//a++;
		//System.out.println(a++); // 후위연산(나중연산)
		//System.out.println(a);
		//System.out.println(++a); // 전위연산(먼저연산)
		
//		1번 문제                  
//		a++;
//		b = (--a) + b;
//		c = (a++) + (b--);
//		a의 값 : 11
//		b의 값 : 29
//		c의 값 : 39
		
//		2번 문제
//		x--;
//		z = x-- + --y;
//		x = 99 + x++ + x;
//		y = y-- + y + ++y;
//		x의 값 : 296
//		y의 값 : 95
//		z의 값 : 131
		
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("1번 문제");
		System.out.println("a++");
		System.out.println("b = (--a) + b;");
		System.out.println("c = (a++) + (--b);");
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c);
	
		System.out.println("2번 문제");
		System.out.println("x--;");
		System.out.println("z = x-- + --y;");
		System.out.println("y= y-- + y + ++y;");
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
		
		System.out.println("부정연산자");
		boolean result = true;
		System.out.println("result의 값 : " + result);
		System.out.println("!result의 값 : " + !result);
		
		
		
		
		
	}
}


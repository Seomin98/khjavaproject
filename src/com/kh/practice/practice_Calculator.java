package com.kh.practice;

import java.util.Scanner;

public class practice_Calculator {
	public static void main(String[] args) {
		// 두 개의 정수를 입력받고 연산자를 입력받아서 
				// 계산하는 계산기 프로그램을 작성하세요!!
				// 정수를 입력해주세요 : 11
				// 정수를 한번 더 입력해주세요 : 22
				// 연산자를 입력해주세요(+,-,*,/,%) : %
				// 결과 : 11 % 22 = 11
		Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력해주세요 : ");
			int input1 = sc.nextInt();
			System.out.println("정수를 한번 더 입력해주세요: ");
			int input2 = sc.nextInt();
			System.out.println("연산자를 입력해주세요 : ");
			char operator = sc.next().charAt(0);
			
			int result = 0;
			
			switch(operator) {
				case '+' :
					System.out.println("+");
					result = input1 + input2;
					break;
				case '-' :
					System.out.println("-");
					result = input1 - input2;
					break;
				case '*' :
					System.out.println("*");
					result = input1 * input2;
					break;
				case '/' :
					System.out.println("/");
					result = input1 / input2;
					break;
				case '%' :
					result = input1 % input2;
					break;
				
			}
		System.out.println("결과 : " + input1 + " " + operator + " " + input2 + " " + "=" + " " + result);
	}

}

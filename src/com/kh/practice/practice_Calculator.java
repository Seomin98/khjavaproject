package com.kh.practice;

import java.util.Scanner;

public class practice_Calculator {
	public static void main(String[] args) {
		// �� ���� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ� 
				// ����ϴ� ���� ���α׷��� �ۼ��ϼ���!!
				// ������ �Է����ּ��� : 11
				// ������ �ѹ� �� �Է����ּ��� : 22
				// �����ڸ� �Է����ּ���(+,-,*,/,%) : %
				// ��� : 11 % 22 = 11
		Scanner sc = new Scanner(System.in);
			System.out.println("������ �Է����ּ��� : ");
			int input1 = sc.nextInt();
			System.out.println("������ �ѹ� �� �Է����ּ���: ");
			int input2 = sc.nextInt();
			System.out.println("�����ڸ� �Է����ּ��� : ");
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
		System.out.println("��� : " + input1 + " " + operator + " " + input2 + " " + "=" + " " + result);
	}

}

package com.kh.practice;

public class Practice_for2 {
	public static void main(String [] args) {
		// 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
		// 1+2+3+4+5+6+7+8+9+10=55	
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			System.out.print(i);
			if(i <= 9) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
		}
		System.out.println(sum);
	}
	
}

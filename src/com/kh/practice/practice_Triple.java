package com.kh.practice;

import java.util.Scanner;

public class practice_Triple {
	public static void main(String [] args) {
		/*
		 * �̰͵� �ּ�
		 * ���׿����� 
		 * �׸��� 3��
		 * (���ǽ�) ? ���� �� : ������ ��
		 * -���ǽ��� �ݵ�� true or false�� ��ȯ
		 * -��/�������� �ַ� ���
		 */
		// (num1 > num2) ? "��" : "����";
		// ������ �Է¹޾� ¦������ Ȧ������ �Ǻ��ϴ�
		// ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
			System.out.println("������ �Է��ϼ��� : ");
			int input = sc.nextInt();
			
			String result = (input % 2 == 0) ? "¦��" : "Ȧ��";
			System.out.println(result + "�Դϴ�");
	}

}

package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.next();
		System.out.println("�¾ ���� �Է����ּ���.");
		int month = sc.nextInt();
		System.out.println("Ű�� �Է����ּ���");
		double tall = sc.nextDouble();
		System.out.println("������ �Է����ּ���");
		char gender = sc.next().charAt(0);
		System.out.println("�ּҸ� �Է����ּ���");
		sc.nextLine(); // ���� ����
		String address = sc.nextLine(); // nextLine�� ������ �ִ� ���� ��밡��(���� ����)
		
		
		System.out.println("�̸���" + name + "�Դϴ�.");
		System.out.println("�¾ ���� " + month + "�Դϴ�.");
		System.out.println("Ű��" + tall + "�Դϴ�");
		System.out.println("������" + gender + "�Դϴ�.");
		System.out.println("�ּҴ�" + address + "�Դϴ�.");
		
	}
	// �̸��� �Է����ּ���. // next()
	// �κ���
	// �¾ ���� �Է����ּ���.
	// 9
	// Ű�� �Է����ּ���.
	// 180
	// ������ �Է����ּ���.
	// ��
	// �ּҸ� �Է����ּ���. // nextLine()
	// ����� ���α�
	
	// �̸��� �κ����Դϴ�.
	// �¾ ���� 9�Դϴ�.
	// Ű�� 180.0�Դϴ�.
	// ������ �� �Դϴ�.
	// �ּҴ� ����� ���α� �Դϴ�.

}

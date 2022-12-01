package com.kh.day07.student;

import java.util.Scanner;

public class StudentFunction {
	Student student;
	
	public StudentFunction() {
		student = new Student();
	}
	/**
	 * 학생관리 프로그램 메뉴 출력
	 * @return choice
	 */
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생 성적 관리 프로그램 =======");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 프로그램 종료");
		System.out.println("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	/**
	 * 학생 성적 입력
	 */
	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생 성적 관리 프로그램 =======");
		System.out.println("학생 이름 입력 : ");
		String name = sc.next();
		System.out.println("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		int math = sc.nextInt();
		//student = new Student(name, kor, eng, math);
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMath(math);
		
	}
	/**
	 * 학생 정보 출력
	 */
	public void printScore() {
		System.out.println("====== 학생 성적 관리 프로그램 =======");
		System.out.println(student.getName() + "학생의 성적");
		System.out.println("국어 성적 : " + student.getKor() + "점");
		System.out.println("영어 성적 : " + student.getEng() + "점");
		System.out.println("수학 성적 : " + student.getMath() + "점");
		
	}
	
	public void goodByeMsg() {}
	
	public void exceptionMsg() {}
}

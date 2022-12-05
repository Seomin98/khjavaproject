package com.kh.day09.upcasting;

public class Student extends Person{
	// Implicit super constructor Person() is undefined for default constructor. 
	// Must define an explicit constructor
	// -> 기본생성자 작성하지 않아서 발생
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}

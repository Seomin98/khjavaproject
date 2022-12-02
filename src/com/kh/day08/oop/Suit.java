package com.kh.day08.oop;

public class Suit {
	
	public int size;
	public String brand;
	public int price;

	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) 호출!"); // (1)
	}

	public Suit(int size, String brand) {
		this(size, brand, 10000); //지워보고 이해해보기
		System.out.println("Suit(int, String) 호출!"); // (2)
	}

	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int, String, int) 호출!"); // (3)
	}
}
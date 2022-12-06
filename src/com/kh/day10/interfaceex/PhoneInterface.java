package com.kh.day10.interfaceex;

public interface PhoneInterface {
	// Illegal modifier for the interface field PhoneInterface.name; 
	// only public, static & final are permitted
	public String NAME = ""; // 상수는 무조건 대문자 // 기울어져 있으면 static 영향
	// name = "Hello World"; // X, 상수값이라서 바뀌지 않음. 
	public static final int TIME_OUT = 10000;
	public void sendCall();
	public abstract void receiveCall();
	// 2. Abstract methods do not specify a body
	abstract void printLogo();
	void displayNumber();
	public default void showLogo() { // 디폴트 메소드
		// 하위 호환성을 위해서 작성한다.
		// 즉, 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}

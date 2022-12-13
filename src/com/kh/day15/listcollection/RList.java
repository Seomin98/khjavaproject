package com.kh.day15.listcollection;

public class RList<T> {
	private Object [] objects;
	private int size;
	
	
	public RList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(T input) {
		objects[size] = input;
		size++;
	}
	// 리턴값이 있으면 (return) 리턴값의 지
	// 메소드 반환형에 적어줌.
	public T get(int index) {
		return (T)objects[index];
	}
	
	public int size() {
		return size;
	}
}

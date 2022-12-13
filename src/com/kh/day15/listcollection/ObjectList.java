package com.kh.day15.listcollection;

public class ObjectList {
	private Object [] objects;
	private int size;
	
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object input) {
		objects[size] = input;
		size++;
	}
	// 리턴값이 있으면 (return) 리턴값의 지
	// 메소드 반환형에 적어줌.
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
}

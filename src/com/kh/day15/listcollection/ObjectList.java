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
	// ���ϰ��� ������ (return) ���ϰ��� ��
	// �޼ҵ� ��ȯ���� ������.
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
}
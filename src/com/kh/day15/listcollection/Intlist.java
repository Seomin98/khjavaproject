package com.kh.day15.listcollection;

public class Intlist {
	private int [] nums;
	private int size;
	
	
	public Intlist() {
		nums = new int[3];
		size = 0;
	}
	
	public void add(int input) {
		nums[size] = input;
		size++;
	}
	// ���ϰ��� ������ (return) ���ϰ��� ��
	// �޼ҵ� ��ȯ���� ������.
	public int get(int index) {
		return nums[index]; // nums[0]
	}
	public int size() {
		return size;
	}
}

package com.kh.day06.array;

public class Exam_DimArray {
	public static void main(String [] args) {
		int [][] arrs = new int[4][4];
		int k = 1; 
		arrs[0][0] = 1;
		System.out.println("세로의 크기(앞의 크기) : " + arrs.length);
		System.out.println("가로의 크기(뒤의 크기) : " + arrs[0].length);
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[1][0] = 4;
		for(int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				arrs[i][e] = k;
				k++;
			}
		}
		// 출력
		for(int i = 0; i < arrs.length; i++) {
			for(int e = 0; e < arrs[i].length; e++) {
				System.out.printf("%2d ", arrs[i][e]);
			}
			System.out.println(); // 개행해주기
		}
	}
}

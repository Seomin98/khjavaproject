package com.kh.day05.array;

public class Exam_SortSelect {
	public static void main(String [] args) {
		// 알고리즘 정렬
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 선택정렬이란?
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 특징 : 데이터 양이 적을 때 좋은 성능을 보여주는 정렬이지만
		// 데이터 양이 많을 때 급격한 성능 저하를 보임.
		// 배열의 n번 인덱스값을 n+1 ~ 마지막 인덱스까지 비교함.
		int [] arrs = {2, 5, 4, 1, 3};
		int min; // 인덱스값 저장
		for(int i =0; i < arrs.length; i++) {
			min = i; // 가장 작을 때 인덱스 값
			for(int j = i+1; j < arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}
		// i=0 일때
		// 1, 5, 4, 2, 3 // 첫번째 결과
		// i=1 일때
		// 1, 2, 4, 5, 3 // 두번째 결과
	}

}

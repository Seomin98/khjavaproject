package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random2_1 {
	public static void main(String [] args) {
		// 동전 앞뒤 맞추기!!
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		for(int i = 0; true; i++) {
			System.out.println("===== 동전 앞 뒤 맞추기 ======");
			System.out.print("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ");
			int choice = sc.nextInt();
			// computer변수에는 1 또는 2의 값이 랜덤하게 들어가야 함.
			int computer = rand.nextInt(2) + 1;
			System.out.println("컴퓨터 : " + computer);
			// choice의 값과 computer의 값이 같으면 맞췄습니다,
			// 다르면 틀렸습니다.
			// if문 작성
			
			if(choice == computer) {
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다.");
				
			}
			
		}

		}

	}



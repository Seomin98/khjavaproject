package com.kh.day07.student;

public class StudentRun {
	public static void main(String [] args) {
		StudentFunction sFunc = new StudentFunction();
		End :
			while(true) {
				int choice = sFunc.printMenu();
				switch(choice) {
					case 1 : 
						sFunc.inputScore();
						break;
					case 2 : 
						sFunc.printScore();
						break;
					case 3 : 
						break End;
					default : 
						break;
			}
		}
	}
}

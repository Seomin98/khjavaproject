package com.kh.day11.exercise;

public class Exercise_Wrapper {
	public void parserExample() {
			String strNum = "221123";
			String strNum2 = "230502";
			// 두 값을 계산해서 출력하시오
			// 결과 : 9379
			//int num2 = Integer.parseInt(strNum2);
			//int num1 = Integer.parseInt(strNum);
			//System.out.println(num2 - num1);
			int result = Integer.parseInt(strNum2) - Integer.parseInt(strNum);
			System.out.println("결과 : " + result);
		
	}

	public void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		// 1. strData를 byte, short, int, long으로 변환하시오.
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum = Long.parseLong(strData);
		// 2. strData를 float, double로 변환하시오.
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		// 3. strData를 char로 변환하시오.
		char word = strData3.charAt(0);
	}
}

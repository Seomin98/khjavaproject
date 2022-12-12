package com.kh.day13.socket.baseball;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class BaseballServer {
	public static void main(String [] args) {
		ServerSocket serverSocket = null;
		int port = 8589;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int [] numbers = new int [3];
		SimpleDateFormat trans = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
		try {
			System.out.println("서버소켓을 생성하였습니다.");
			serverSocket = new ServerSocket(port);
			Thread.sleep(2000);
			Date date = new Date();
			System.out.println((trans.format(date)));
			System.out.println("클라이언트의 접속을 기다립니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속했습니다.");
			is = socket.getInputStream();
			os = socket.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			Random rand = new Random();
			// 번호 3개를 뽑은 후에 게임 준비해야함
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = rand.nextInt(9)+1;
				// 중복제거
				for(int e = 0; e < i; e++) {
					if(numbers[e] == numbers[i]) {
						i--; // -> 중복제거!
						break;
					}
				}
			}
			System.out.println("서버 숫자 ->" + numbers[0] + " " + numbers[1] + " " + numbers[2]);
			System.out.println("서버 준비 완료");
			while(true) {
				// 값 받기
				String readNum = dis.readUTF();
				System.out.println("받기 : " + readNum);
				// 받은 값이 numbers의 값과 비교했을 때
				// 숫자가 맞고 위치도 맞는지
				// 숫자는 맞는데 위치는 틀린지
				// 아무것도 맞지 않았는지를
				// 스트라이크, 볼로 출력해준다.
				int strike = 0;
				int ball = 0;
				// 3 7 5
				// 1. 배열과 배열의 비교 numbers가 int 배열이라서
				// 입력받은 값은 숫자가 저장되는 배열로 변경(split() 사용) -> String 배열
				String []  readNums = readNum.split(" ");
				for(int i = 0; i < numbers.length; i++) {
					for(int e = 0; e < readNums.length; e++) {
						// Incompatible operand types int and String
						if(numbers[i] == Integer.parseInt(readNums[e])) {
							// 먼저 값이 같은지 비교를 함.
							// 그리고 위치가 같은지 비교를 함.
							if(i == e) {
								// 스트라이크인지 볼인지 판정
								strike++;
							}else {
								ball++;
							}
							
						}
					}
				}
				String result = (strike + "스트라이크" + ball + "볼");
				System.out.println(result);
				// 클라이언트로 결과값 보내주기!
				dos.writeUTF(result);
				// 스트라이크가 3이면 게임종료하기~
				if(strike == 3) {
					System.out.println("아웃! 게임종료~");
					break;
				}
			}
		} catch (Exception e) { 
//			 모든 예외클래스의 조상클래스는 Exception이다.
//			예외 객체를 업캐스팅하여 처리할 수 있다.
//			try ~ catch에서 Exception을 이용해서 예외처리하면 코드가 줄어든다.
//			하지만 예외별 메시지를 출력하기 어렵다.

			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
				is.close();
				os.close();
				serverSocket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

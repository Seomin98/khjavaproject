package com.kh.day14.socket.calculator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		InputStream is = null;
		OutputStream os = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		int port = 8989;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("서버 구동중입니다.");
			Thread.sleep(1000);
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다.");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트와 연결되었습니다.");
			os = socket.getOutputStream();
			is = socket.getInputStream();
			dos = new DataOutputStream(os);
			dis = new DataInputStream(is);
			while(true)	{
			// 받은 메시지 : 12 + 1
			String msg = dis.readUTF();
			if(msg.equalsIgnoreCase("bye")) {
				System.out.println("클라이언트가 종료하였습니다.");
				break;
			}
			System.out.println("받은 메세지 : " + msg);
			// 연산결과 보내기
			String [] msgArrs = msg.split(" ");
			if(msgArrs.length != 3) {
				msg = "end";
				dos.writeUTF(msg);
				continue;
				///System.out.println("잘못 입력하셨습니다. 형식에 맞게 입력해주세요.");
			}
			int num1 = Integer.parseInt(msgArrs[0]);
			String operator = msgArrs[1];
			int num2 = Integer.parseInt(msgArrs[2]);
			String result = "";
			switch(operator) {
			case "+" : result = num1 + num2 + ""; break;
			case "-" : result = String.valueOf(num1 - num2); break;
			case "*" : result = String.valueOf(num1 * num2); break;
			case "/" : result = num1 / num2 + ""; break;
			case "%" : result = num1 % num2 + ""; break;
			default : result = "연산자를 잘못입력하셨습니다."; break;
			}
			dos.writeUTF(result);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

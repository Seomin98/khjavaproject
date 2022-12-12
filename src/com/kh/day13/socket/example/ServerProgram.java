package com.kh.day13.socket.example;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
	// Address already in use: NET_Bind - 콘솔 창에 있던거 중지
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		// 데이터를 받을 때에는 어떤 스트림?
		// - 입력스트림
		InputStream is = null;
		OutputStream os = null;
		try {
			// Unhandled exception type IOException
			System.out.println("연결 기다림..");
			serverSocket = new ServerSocket(4885);
			Socket socket = serverSocket.accept(); // accept -> 연결 기다림
			System.out.println("연결 수락됨!!");

			/////////////////// 데이터 받기 ////////////////////
			byte [] bytes = new byte[100];
			is = socket.getInputStream();
			int readByteNo = is.read(bytes);
			String message = new String(bytes, 0, readByteNo);
			System.out.println("데이터 받기 성공 : " + message);
			////////////////////////////////////////////////////
			
			
			////////////////// 데이터 보내기 ///////////////////
			os = socket.getOutputStream();
			message = "Hello Client"; 		// 보내려고 하는 메시지
			bytes = message.getBytes();		// write 메소드 전달값 : 바이트 배열로 변환
			os.write(bytes);
			os.flush();
			System.out.println("데이터 보내기 성공");
			////////////////////////////////////////////////////
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

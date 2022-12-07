package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String [] args) {
		InputStream is = null;
		
		// Unhandled exception type FileNotFoundException -> Checked Exception
		// -> 반드시 try ~ catch 해줘야 하는 Exception
		try {
			is = new FileInputStream("src/iostream/inputStream.txt");
			// Unhandled exception type IOException
			int readByte;
			while(true) {
				readByte = is.read();
				// 없으면 그만 읽어!!
				if (readByte == -1) break;
				// Unreachable code
				System.out.print((char)readByte);
			}
//			for(int i = 0; i < 5; i++) {
//				readByte = is.read();
//				System.out.print((char)readByte);
//			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

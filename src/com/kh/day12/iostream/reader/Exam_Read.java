package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String [] arsg) {
		// 바이트 기반 스트림
		InputStream is = null;
		// 문자 기반 스트림 (한글자씩 읽기때문에 문자가 깨지지않음)
		Reader reader = null;
		try {
			reader = new FileReader("src/iostream/filereader.txt");
			while(true) {
				// Unhandled exception type IOException
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 반드시 실행되어야 하는 코드 작성
			// Unhandled exception type IOException
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}

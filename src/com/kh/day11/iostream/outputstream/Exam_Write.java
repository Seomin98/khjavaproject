package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {
	public static void main(String [] arsg) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("src/iostream/outputStream.txt");
			byte [] data = "Hello I/O".getBytes();
			for(int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
				os.write(data[i]);
			}
			System.out.println();
				os.flush();
				System.out.println("?????Ϸ?!!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

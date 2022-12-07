package com.kh.day11.iostream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {
	public static void main(String [] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/iostream/outputstream.txt");
			byte [] data = "JAVAscript".getBytes();
			os.write(data, 4, 6);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

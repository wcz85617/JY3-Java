package com.alibaba.tt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
	
	//字符输入流的标准版本

	public static void main(String[] args) {
		
		File file = new File("c:\\java.txt");
		Reader r = null;
		
		try {
			r = new FileReader(file);
			char[] c = new char[1024];
			int read = r.read(c);
			String str = new String(c,0,read);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}

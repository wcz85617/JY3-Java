package com.alibaba.tt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) {
		
		FileInputStream is= null;
		try {
			is= new FileInputStream("C:\\java.txt");
			byte[] b = new byte[1024];
			int len = 0;
			String string = null;
			while((len = is.read(b))!= -1)
			{
				string = new String(b,0,len);
			}
			System.out.println(string);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
	}

}

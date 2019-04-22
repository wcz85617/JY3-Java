package com.alibaba.tt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStream2 {
	//字节的输入流完成版
	public static void main(String[] args)  {
	     
		File file = new File("c:\\alibaba.txt");
		InputStream is = null;
		if(!file.exists())
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int len = 0;
		byte[] b = new byte[1024];
		String str = null;
		try {
			while((len=is.read(b))!= -1)
			{
				str = new String(b, 0, len);
			}
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(is != null)
			{
				try {is.close();}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 
	}
		
		
		
}



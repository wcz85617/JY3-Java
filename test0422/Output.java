package com.alibaba.tt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class Output {
	//�ֽ�������ı�׼д��
	public static void main(String[] args) {
		File file = new File("c:\\nihao.txt");
		OutputStream os = null;
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
			os = new FileOutputStream(file);
			String str = "now is hot";
			os.write(str.getBytes());
			System.out.println("д���ɹ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != os)
			{
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	
	}

}

package com.alibaba.tt;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {
	//ͨ������Դ�ļ���ַ���и��Ƶ�������                                                                                                                     
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("������Դ�ļ�");
	String strFilePath = scanner.nextLine();
	String[] split = strFilePath.split("\\.");
	 File file = new File(strFilePath);
	 File file2= new File(split[0]+"_����."+split[1]);
	 InputStream  is = null;
	 OutputStream os = null;
	 try {
		is = new FileInputStream(file);
		os = new FileOutputStream(file2);
		
		byte[] b = new byte[1024];
		int len = 0;
		while((len = is.read(b))!=-1){
			os.write(b,0,len);
		}
		System.out.println("���Ƴɹ�");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(null != os) {
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(null != is) {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
   }

}

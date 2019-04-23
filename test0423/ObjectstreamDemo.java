package com.alibb.tt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectstreamDemo {
	public static void main(String[] args) {
		Account account = new Account("马云","alibb");
		//System.out.println(account);
		File file = new File("C:\\java.txt");
		try(FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);)
		{
			oos.writeObject(account);
			System.out.println("写出成功");
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}

}
class Account implements Serializable{
	
	public Account() {
		
	}
	
	public Account(String name, String psw) {
		super();
		this.name = name;
		this.psw = psw;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", psw=" + psw + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}

	private String name;
	private String psw;
}


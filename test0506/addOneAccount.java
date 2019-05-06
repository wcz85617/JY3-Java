package com.alibaba.tt;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;

public class addOneAccount {
	
	
	public static Properties prop;
	   
	   static {
		   prop = new Properties();
		   try {
			prop.load(addOneAccount.class.getResourceAsStream("/SettingProperties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   
	   }
	   public void add(Account acc) {
		   PreparedStatement prepareStatement = null;
		   // ȡ�����ݿ������
		try(Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));)
		{
			//ִ������
          String str ="INSERT INTO account VALUES(?,?,?)";
         prepareStatement = conn.prepareStatement(str);
          
          //����������ֵ
          prepareStatement.setInt(1, acc.getUseId());
          prepareStatement.setString(2, acc.getUseName());
          prepareStatement.setDouble(3, acc.getDeposit());
          
          
          //��� �޸� ɾ�� �����ڸ��� ��executeupdate ����
          int executeUpdate = prepareStatement.executeUpdate();
          if(executeUpdate != 0) {
        	  
        	  System.out.println("���³ɹ�");
        	  
        	  
          }
          
          
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != prepareStatement) {
				try {
					prepareStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
			
		}
		   
	   }
	   public static void main(String[] args) {
		   
		   Account account = new Account(6,"�ŷ���",59631.00);
		   addOneAccount addOneAccount = new addOneAccount();
		   addOneAccount.add(account);
		   System.out.println("��ӳɹ���");
		
	}
	   
	         

}

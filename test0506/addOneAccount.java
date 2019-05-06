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
		   // 取得数据库的链接
		try(Connection conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"), prop.getProperty("password"));)
		{
			//执行语句块
          String str ="INSERT INTO account VALUES(?,?,?)";
         prepareStatement = conn.prepareStatement(str);
          
          //将三个？赋值
          prepareStatement.setInt(1, acc.getUseId());
          prepareStatement.setString(2, acc.getUseName());
          prepareStatement.setDouble(3, acc.getDeposit());
          
          
          //添加 修改 删除 是属于更新 用executeupdate 方法
          int executeUpdate = prepareStatement.executeUpdate();
          if(executeUpdate != 0) {
        	  
        	  System.out.println("更新成功");
        	  
        	  
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
		   
		   Account account = new Account(6,"张发发",59631.00);
		   addOneAccount addOneAccount = new addOneAccount();
		   addOneAccount.add(account);
		   System.out.println("添加成功！");
		
	}
	   
	         

}

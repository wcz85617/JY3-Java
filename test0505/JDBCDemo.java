package com.alibaba.tt;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class JDBCDemo {
	//包括了配置文件设置，新建了集合类，新建接收类，关闭流，主函数测试的完整案例
	   public static Properties prop;
	   
	   static {
		   prop = new Properties();
		   try {
			prop.load(JDBCDemo.class.getResourceAsStream("/SettingProperties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   
	   }

	
		public List<Account> queryAllAccount() {
	 
		
			    List<Account> arraryList = new ArrayList<>();
			    String url = prop.getProperty("url");
			    Connection conn = null;
			    PreparedStatement prepareStatement = null;
			    ResultSet rs = null;
			    
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection(url, prop.getProperty("username"), prop.getProperty("password"));
				
				String str = "SELECT * FROM account";
				
				prepareStatement = conn.prepareStatement(str);
				
				
				rs = prepareStatement.executeQuery();
				
				while(rs.next())
				{
					int int1 = rs.getInt("useId");
					String string = rs.getString("useName");
					double double1 = rs.getDouble("deposit");
					Account account = new Account(int1,string,double1);
					arraryList.add(account);
				}
				
		
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(null != rs) {
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(null != prepareStatement) {
					try {
						prepareStatement.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(null != conn) {
					try {
						conn.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
				
			}
			return arraryList;
		}

	

	public static void main(String[] args) {
		JDBCDemo jdbcDemo = new JDBCDemo();
		List<Account> queryAllAccount = jdbcDemo.queryAllAccount();
		System.out.print(queryAllAccount);
		System.out.println();
		
		

	}

}

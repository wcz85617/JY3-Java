package com.neuedu.test;

public class TestDemo {
	
	public TestDemo()
	{
		usernames = new String[] {"hello"};
		paw = new String[] {"123456"};
	}
	String username;
	String password;
	String[] usernames;
	String[] paw;
    
    public boolean checkUser(String username,String password )
    {
		for(int i=0;i<usernames.length;i++)
		{
			if(usernames[i].equals(username) && paw[i].equals(password))
			{
				return true;
			}
		}	
	    return false;
    }
}





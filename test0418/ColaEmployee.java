package com.alibaba.tt;

public class ColaEmployee {
	
	//�������� ������ 0418 ���һ��4.5 û�� Ҳû�п��� ��Ϊû��˼·��
	public ColaEmployee(String workerName,int workerBirthday,int month)
	{
		this.workerName = workerName;
		this.workerBirthday = workerBirthday;
		this.month = month;
	}
	private String workerName;
	private int workerBirthday;
	private int month;
	
	public void setName(String workerName)
	{
		this.workerName = workerName;
	}
	public String getName()
	{
		return workerName;
	}
	public void setBirthday(int workerBirthday)
	{
		this.workerBirthday = workerBirthday;
	}
	public int getBirthday()
	{
		return workerBirthday;
	}
	public void setMonth(int month) {
		
		this.month= month;
	}
	public int getMonth() {
		return month;
	}
      public void getSalary(int month)
      {   
      }

}

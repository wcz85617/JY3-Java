package com.alibaba.tt;

public class SalesEmployee extends ColaEmployee {
	    private int sale;
	    private double push;
	
	public SalesEmployee(String workerName, int workerBirthday, int month,int sale,double push) {
		super(workerName, workerBirthday, month);
		this.sale = sale;
		this.push =push;
		if(super.getMonth() ==super.getBirthday())
		{
			System.out.println("Ա��"+super.getName()+"�¹��ʽ��Ϊ"+(sale*push+100));
		}else
		{
			System.out.println("Ա��"+super.getName()+"�¹��ʽ��Ϊ"+(sale*push));
		}
		
	}
	

}

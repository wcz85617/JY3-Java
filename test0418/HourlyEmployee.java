package com.alibaba.tt;

public class HourlyEmployee extends ColaEmployee{
	
		private int play;
		private int hour;
	public HourlyEmployee(String workerName, int workerBirthday, int month,int play,int hour) {
		super(workerName, workerBirthday, month);
		this.play = play;
		this.hour = hour;
		if(super.getMonth()!=super.getBirthday()&& hour>=160)
		{
			System.out.println("Ա��"+getName()+month+"�¹��ʽ��Ϊ"+(play*160+(hour-160)*1.5));
		}else if (super.getMonth()==super.getBirthday()&&hour>=160){
			System.out.println("Ա��"+getName()+month+"�¹��ʽ��Ϊ"+(play*160+(hour-160)*1.5+100));
		}else if(super.getMonth()!=super.getBirthday()&& hour<160) {
			System.out.println("Ա��"+getName()+month+"�¹��ʽ��Ϊ"+(play*160));
		}else if(super.getMonth()==super.getBirthday()&& hour<160) {
			System.out.println("Ա��"+getName()+month+"�¹��ʽ��Ϊ"+(play*160+100));	
		}
	}
	


}

package com.neusoft.tt;

public class Worktest {
	public static void main(String[] args) {
		int a = 1;
		int sum = 0;
		while(a <= 10)
		{
			if(a%3==0)
			{
				sum = sum + a;
			}
			a++;
		}
		System.out.println(sum);
		
		double dis = f(2,4,2,4);
		
		System.out.println(dis);
		
		String srt = "5553455247123954275";
		int num =0;
		for(int i=0;i<srt.length();i=i+2)
		{
			char c = srt.charAt(i);
			num = num + c - 48;
		}
		
		
	}
	public static double f(int x1,int x2,int y1,int y2)
	{
		double dis = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) );
		//double dis = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1-y2,2));
		return dis;
		
	}

}

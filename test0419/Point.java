package com.alibaba.tt;

public class Point 
{
	//����ʮ���յĿκ���ҵ
			
	
	        public Point(int x,int y) 
			{
	        	this.x = x;
	        	this.y = y;
			}
		    int x;
			int y;
			public double distance(int x,int y)
			{
				
				return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
						}
			public double distance(Point p){
						return this.distance(p.x, p.y); 
				
			}
			
			
			
			
}


			
			
		


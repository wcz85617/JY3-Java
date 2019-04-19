package com.alibaba.tt;

public class Cricle extends test {
	public Cricle(int r) {
		this.r = r;
		this.p = p;
	}
	int r;
	Point p;
	public double area(int r)
	{
		
		return Math.PI*r*r;
	}
	
	public boolean contains(Point p1)
	{
		
		return Math.pow((p1.x-p.x), 2) + Math.pow((p1.y-p.y), 2)<=r*r;
		
	}
	

}

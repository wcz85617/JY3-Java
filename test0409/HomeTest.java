package com.neuedu.test;

public class HomeTest {

	public static void main(String[] args) {
		Point center = new Point(0,0);
        Circle circle = new Circle(center,2);
        Point comparePoint = new Point(1,0);
        
        System.out.println(circle.contains(comparePoint)==true?"��Բ��":"��Բ��");
        //���ط���ʱ��������ֵ����Ҫ�зֿ���
        //System.out.println(comparePoint.x,comparePoint.y)==true?"��Բ��":"��Բ��");
		
	}
}

class Circle
{
	public Circle(int x,int y)
	{
		
	}
	public Circle(Point p1,int r)
	{
		this.p1 = p1;
		this.r = r;
	}
	
	Point p1;
	int r;
	
	public double getArae(int r)
	{
		
		return Math.PI*r*r;
	}
	
	public boolean contains(Point p)
	//���ط���
	//public boolean contains(int x,int y)
	{
		
		boolean a = Math.pow((p1.x-p.x),2)+Math.pow((p1.y-p.y),2)<=r*r;
		return a;
		
	}
}
class Point
{
	public Point(int x,int y)
	{
		this.x = y;
		this.y = y;	
	}
	int x;
	int y;
	

}
	



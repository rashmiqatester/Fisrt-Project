package com.first;

public class rectangle {
	
//	area ,public ,double without argument
	
	public double area()
	{
		double l1=20.0;
		double l2=10.1;
		
		return (l1*l2);
			
		
	}
	
	//non static ,double with argument
	public double area(double l1 ,double l2)
	{
		return(l1*l2);
		
		
		
		
	}
public static void main (String[] args) 
{
rectangle r=new rectangle()	;
//r.area();
System.out.println(r.area());
r.area(13.6, 12.1);
System.out.println(r.area(13.6, 12.1));   
}
}


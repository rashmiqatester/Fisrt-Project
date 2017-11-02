package com.first;

public class Hypotenuse {
	//double a;
	//double b;
	//double c;
	public double triangle(double a, double b)//non static with return and with argument
	{
		double c =a*a + b*b;
		System.out.println(c*c);
		return(c*c);
				
				
	}
public static void main(String args[]){
	Hypotenuse H1=new Hypotenuse();
	H1.triangle(2, 3);
	
}
}

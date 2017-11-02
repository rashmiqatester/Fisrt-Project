package com.first;

public class sale {
	double Revenue;
	double sale;
	double Percent;
	public void comp(int Revenue ,int Percent )//nonstatic without return with argument
	{
		sale =Revenue * Percent*1/100;
				System.out.println(sale);
	}
public static void main(String args[]){
	sale s1=new sale();
	s1.comp(20000, 10);
}
}


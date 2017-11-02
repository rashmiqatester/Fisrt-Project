package com.first;

public class calculator {
	int x=12;
	int y=13;
	public void add()//nonstatic with no return value nd no argument
	{
		System .out.println(x+y);
	}
public void add(int x,int y)//nonstatic with no return and with argument
{
System.out.println(x+y);
}

public int adding(int x,int y)//nonstatic with return value and with argument
{
	{System.out.println(x+y);}
return (x+y);	
}
public static int added(int x ,int y)//static with return value and with argument
		{
	{System.out.println(x+y);}
	return (x+y);
		}
public static int adde()//static with return and without argument
{
	calculator c1=new calculator();
	System.out.println(c1.x+c1.y);
	return(c1.x+c1.y);
	}
public static void main (String [] args)
{
calculator c=new calculator();
c.add();
c.add(10,30);
c.adding(18,78);
calculator.added(19 ,30);
	calculator.adde();
}

}





	
	

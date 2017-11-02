package com.first;

public class Rightangle {
	 int x=10;
	 int y=10;
public void angle()//nonstatic with no return and no argument
{
System.out.println(x*y);
}

public void angle(int x, int y)//nonstatic with no return and with argument
{
	System.out.println(x*y);
	}
public int angle1(int x,int y){ //nonstatic with return and with argument
System.out.println(x*y);

return(x*y);
}

public int angled()//nonstatic with return and without argument
{
	System.out.println(x*y);
	return(x*y);}
public static void angle1()//static without return and without argument
{
	Rightangle P=new Rightangle();
	System.out.println(P.x*P.y);
}

public static int angle2()//static with return and without argument
{
	Rightangle P=new Rightangle();
	System.out.println(P.x*P.y);
	return(P.x*P.y);
}

public static int angle3(int x,int y) //static with return and with argument
{
	//Rightangle P=new Rightangle();
	System.out.println(x*y);
	return(x*y);
	}
public static void main(String args[]){
	
	Rightangle R1=new Rightangle();
	R1.angle();
	R1.angle(12, 12);
	//Rightangle R2=new Rightangle();
	R1.angle1(15, 15);
	R1.angled();
	Rightangle.angle1();
	Rightangle.angle2();
	Rightangle.angle3(14,14);
}

}



	/*Rightangle (){
		int a=20;
		int b=30;
		this.x=a;
		this.y=b;
	}
	public static void main(String args[]){
		Rightangle s1=new Rightangle();
		s1.multiply();
		Rightangle.multiply();
	}
	public void multiply ()// nonstatic method with no return value and no argument
	{
	System.out.println(x*y);
	
}
	//static method with return value and no argument
	//public static int add(){
	//System.out.println(a+b);
	//return (a+b);	
	
	}*/







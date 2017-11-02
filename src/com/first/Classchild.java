package com.first;
//Class1 is parent and Classchild is child class
public class Classchild extends Class1{
	int x=2;
	int y=2;
	int z;
	
	public void multiplication(){
		z=x*y;
		System.out.println("multiplication is :"+ z);
		
	}
public static void main(String args[]){
	//int x=100;
	//int y=20;
	Classchild T=new Classchild();
	Class1 c=new Class1();
	c.addition();
	c.subtraction();
	T.multiplication();
	
}
}

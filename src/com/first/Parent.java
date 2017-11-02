package com.first;

public class Parent extends Mother implements Language{
	public void whoIam()
	{
		System.out.println("I am a parent");
	}
	
public static void main(String args[]){
	Parent P2=new Parent();
	P2.whoIam();
	Mother M1=new Parent();
	M1.whoIam();
	
	
}

@Override
public void getlanguage() {
	// TODO Auto-generated method stub
	System.out.println("I like english");
}
}

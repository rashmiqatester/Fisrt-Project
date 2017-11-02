package com.first;

public class Child extends Parent implements Language{
	//method overriding
	public void whoIam(){
	System.out.println("i am a child");
	}
public static void main(String args[]){
Parent P=new Parent();
P.whoIam();
Parent P1=new Child();
P1.whoIam();
Language L1=new Parent();
L1.getlanguage();
Language L2=new Child();
L2.getlanguage();
Mother M1=new Mother();
M1.whoIam();
}
@Override
public void getlanguage() {
	// TODO Auto-generated method stub
	System.out.println("I like hindi");
}}

package com.first;

public class Add {
	
	//double salary;
	//double percentage;
	public void calculateincent (double salary ,double percent){
		double incentive;
		
		incentive=salary*percent*1/100;
		System.out.println(incentive);
		
	}
	public static void main (String [] args){
		Add c1=new Add();
		c1.calculateincent(10000.2, 10);
		

	}
}

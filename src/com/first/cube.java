package com.first;

public class cube {
	int x=10;
	int y=20;
	int z=30;
	public void cmn()//nonstatic with no return without argument
	{
		System.out.println(x*y*z);
	}
	public int cmn(int x,int y ,int z)//nonstatic with return and with argument
	{
		{System.out.println(x*y*z);}
		return(x*y*z);
	}
		public static void main (String args[]){
cube c= new cube();
c.cmn();
c.cmn(10,12,16);
}
}	

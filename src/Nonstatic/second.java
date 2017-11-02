package Nonstatic;

public class second {
	int z =1000;
	public static void main (String [] args) //main is method //string array
	{
		second a =new second();
		int x =10;//local variable
		int y=100;//local variable
		System.out.println(x+y);
		System.out.println(a.z);
	}

}

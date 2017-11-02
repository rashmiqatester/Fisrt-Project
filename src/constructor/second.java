package constructor;

public class second
{
	 static int a;
	double b;
	String c;
	
	second()
	{
		a=10;
		b=10.07;
		c="Hello";	
		System.out.println(a);
	}
second(int x ,double y ,String z)
{
	second.a=x;
	this.b=y;		
	this.c=z;
	System.out.println(b);
}
public static void main(String [] args)

{
	second x1= new second(1,2,"car");
	
	//x1.second();
	
}
}

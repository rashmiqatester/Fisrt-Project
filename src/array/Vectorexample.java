package array;

import java.util.Vector;

//vector is thread safe.vector is synchronized.
public class Vectorexample
{
	public static void main(String[] args) {
		Vector<Double> v=new Vector<Double>();
		v.add(10.32);
		v.add(12.34);
		v.add(45.5);
		v.add(56.76);
		System.out.println(v.size());//to calculate the size of the array list.
		for (int j=0;j<=3 ;j++)
		
	{
		System.out.println(v.get(j));
		
	}
	
	}}



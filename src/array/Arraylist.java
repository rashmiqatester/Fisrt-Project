package array;

import java.util.ArrayList;

public class Arraylist {
public static void main(String[] args) {
	ArrayList<Integer> arrlist =new ArrayList<Integer>();
	
	arrlist.add(67);
	arrlist.add(10);
	arrlist.add(34);
	arrlist.add(12);
	arrlist.add(33);
	arrlist.add(22);
	System.out.println(arrlist.size());
	for(int j=0;j<=4 ;j++)
		
	{
		System.out.println(arrlist.get(j));
		
	}
}
}
//<> this is known as generics.arraylit is auto expandable.

//how to find the size of arraylist :-System.out.println(arraylist.size());

//arraylist = vector
//hashmap=hashtable
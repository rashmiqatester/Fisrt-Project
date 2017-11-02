package array;

import java.util.HashMap;
import java.util.Hashtable;
//thread safe ,  synchronized

public class HashTableexample {
	public static void main(String[] args) {
	
	Hashtable<Integer,String> map =new Hashtable<Integer,String>();
	map.put(1, "kite");
	map.put(2, "kity");
	map.put(3, "car");
	map.put(4, "pen");
	System.out.println(map.size());
	System.out.println(map.get(3));
	
	Hashtable<String,String> mapstr =new Hashtable<String,String>();
	mapstr.put("F", "kite");
	mapstr.put("R", "kity");
	mapstr.put("G", "car");
	mapstr.put("H", "pen");
	System.out.println(mapstr.get("H"));
	System.out.println(mapstr.size());

}}

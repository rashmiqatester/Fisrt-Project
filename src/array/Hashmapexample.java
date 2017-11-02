package array;

import java.util.HashMap;

//hashmap depends on key value pair.first argument is key and second argument is pair.
//not thread safe ,  not synchronized
public class Hashmapexample {
	public static void main(String[] args) {
		HashMap<Integer,String> map =new HashMap<Integer,String>();
		map.put(1, "kite");
		map.put(2, "kity");
		map.put(3, "car");
		map.put(4, "pen");
		System.out.println(map.size());
		System.out.println(map.get(3));
		
		HashMap<String,String> mapstr =new HashMap<String,String>();
		mapstr.put("F", "kite");
		mapstr.put("R", "kity");
		mapstr.put("G", "car");
		mapstr.put("H", "pen");
		System.out.println(mapstr.get("H"));
		System.out.println(mapstr.size());
		
	}

}

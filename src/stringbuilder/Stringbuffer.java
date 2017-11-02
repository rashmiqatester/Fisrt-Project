package stringbuilder;

public class Stringbuffer {
	
	public static void main(String args[]){
		StringBuffer s=new StringBuffer();
		s.append("6");
		s.append("7");
		System.out.println(s);
		
		StringBuilder s1=new StringBuilder();
		s1.append("Rashmi");
		s1.append("  ");
		s1.append("sharma");
		System.out.println(s1);
	}

}
//thread safe
//immutable - strings are immutable.(which cannot be changed)
//string builder and string buffer are mutable.
package array;

public class Array {
	public static void main(String args[]){
		int [] arr1=new int[6];
		arr1[0]=2;
		arr1[1]=7;
		arr1[2]=2;
		arr1[3]=7;
		arr1[4]=5;
		arr1[5]=7;
		
		String [] arrstr=new String[6];
		arrstr[0]="GB";
		arrstr[1]="GT";
		arrstr[2]="GK";		
		arrstr[3]="GS";
		arrstr[4]="GM";
		
		
		for (int j=0;j<=5;j++)
		{
			System.out.println(arr1[j]);
			System.out.println(arrstr[j]);
		}
	}

}

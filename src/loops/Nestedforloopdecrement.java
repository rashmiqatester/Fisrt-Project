package loops;

public class Nestedforloopdecrement {
	public static void main(String args[]) {
		String x="";
		for(int i=10;i>=1 ;i--)
		{
			x="";
		
			for (int j=1; j<=i ; j++) 
			{
				x = x + "*";
				System.out.print(x);
				x="";
			}
			System.out.println('\n');
		
			
		}	
	}
	}



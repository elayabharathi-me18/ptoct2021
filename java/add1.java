import java.io.*;
import java.util.*;
class add1
{
	public static void main(String []args) throws Exception
	{
		File file = new File("number.txt");
		Scanner sc = new Scanner(file);
		int sum=0;
		while(sc.hasNextInt())
		{
		 	sum=sum+sc.nextInt();
		}

		System.out.println(sum);
	}
	
}

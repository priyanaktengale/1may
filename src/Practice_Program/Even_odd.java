package Practice_Program;

import java.util.Scanner;

public class Even_odd 
{
		public static void main(String[] args)
	{
			int num;
		System.out.println("enter any no");
		@SuppressWarnings("resource")
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
	
		if(num%2==0)
		{
			System.out.println("num is even no");
		}
		else
		{
			System.out.println("num is odd no");
		}

}
}

package JavaBasics;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		int age;
		System.out.println("enter any age");
		@SuppressWarnings("resource")
		Scanner r=new Scanner(System.in);
		age=r.nextInt();
		if(age>18)
		{
			System.out.println("I can drive");
			if(age>21)
			{
				System.out.println("A girl can marrige");
			}
			else
			{
				System.out.println("A girl can not marrige");
			}
		}
		else
		{
			if(age>15)
			{
				System.out.println("A student can take vaccine ");
			}
			else
			{
				System.out.println("A student can not take vaccine ");

			}
			System.out.println("A man can not drive");
		}
		
		
		

	}

}

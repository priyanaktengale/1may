package JavaBasics;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		int marks;
		System.out.println("enter any marks");
		@SuppressWarnings("resource")
		Scanner p=new Scanner(System.in);
		marks=p.nextInt();
		if(marks>=75&&marks<=70)
		{
			System.out.println("passed with distinction:");
		}
		else if(marks>60&&marks<=70)
		{
			System.out.println("passed with first class:");	
		}
		else if(marks>50&&marks<=60)
		{
			System.out.println("passed with second class:");	
		}
		else
		{
			System.out.println("Failed");	
		}
	}

}

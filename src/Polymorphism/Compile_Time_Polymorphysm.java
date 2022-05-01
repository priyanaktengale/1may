package Polymorphism;

public class Compile_Time_Polymorphysm {
	public void Addition(int a)
	{
		int sum=a+a;
		System.out.println("Addition ="+sum);
	}
	public void Addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("Addition ="+sum);
	}
	public void Addition(int a,int b,int c)
	{
		int sum=a+b+c;
		System.out.println("Addition ="+sum);
	}


	public static void main(String[] args) 
	{
		Compile_Time_Polymorphysm c=new Compile_Time_Polymorphysm();
		c.Addition(2);
		c.Addition(2,10,34);
		c.Addition(2,9);
	}

}

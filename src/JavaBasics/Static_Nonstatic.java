package JavaBasics;

public class Static_Nonstatic {
	static int num1=5;
	int num2=8;
	public static void add()
	{
		Static_Nonstatic a=new Static_Nonstatic();
		int c=num1+a.num2;
		System.out.println("Addition of two no"+c);
	}
	public void sub()
	{
		int b=num2-num1;
		System.out.println("substraction of two no:"+b);
	}
	

	public static void main(String[] args) {
		Static_Nonstatic a=new Static_Nonstatic();
		add();
		a.sub();
		

	}

}

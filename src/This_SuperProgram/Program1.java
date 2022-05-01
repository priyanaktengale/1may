package This_SuperProgram;

public class Program1 {
	int num=444;
	
	public Program1(int num)
	{
		//num=this.num;
		System.out.println("num="+this.num);
	}
	public void display()
	{
		System.out.println("num="+num);
	}
	public static void main(String[] args)
	{
		Program1 a=new Program1(100);
		a.display();
	}
}

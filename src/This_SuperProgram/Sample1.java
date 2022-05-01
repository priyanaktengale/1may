package This_SuperProgram;

public class Sample1 extends Sample
{
	int a=20;   //global variable of current class
	public void display()
	{
		int a=95;        // lacal varoable of current class
    	System.out.println(a);	
    	System.out.println(this.a);	
    	System.out.println(super.a);	
	}

}

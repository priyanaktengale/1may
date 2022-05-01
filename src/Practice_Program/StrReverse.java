package Practice_Program;

public class StrReverse {

	public static void main(String[] args) {
	String a="Priya";
	String rev="";
	int lenght=a.length();
	System.out.println(lenght);
	for(int i=lenght-1;i>=0;i--)
	{
		 rev=rev+a.charAt(i);
	}
	System.out.println("reverse string:"+rev);
	}

}

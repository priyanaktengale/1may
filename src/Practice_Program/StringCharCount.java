package Practice_Program;

public class StringCharCount {

	public static void main(String[] args)
	{
		String s="I am very confiddent girl";
		int totalL=s.length();
		System.out.println(totalL);
		int totallenghtwithotd=s.replace("d","").length();
		System.out.println(totallenghtwithotd);
		int count=totalL-totallenghtwithotd;
		System.out.println("Count of d="+count);
	
	}

}

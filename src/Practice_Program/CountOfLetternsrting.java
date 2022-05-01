package Practice_Program;

public class CountOfLetternsrting {

	public static void main(String[] args) 
	{
		String s="hi I am learning java programming";
        int TotalStr=s.length();
        System.out.println(TotalStr);
        int TolatStrWithota=s.replace("a","").length();
        int count=TotalStr-TolatStrWithota;
        System.out.println("Count of letter String:"+count);
        
	}

}

package Generlization;

public class Test_MoileInterface {

	public static void main(String[] args)
	{
		Airtel a=new Airtel();
		
		a.Internet();
		a.sms();
		a.sim();
		
		Jio j=new Jio();
		j.Internet();
		j.sms();
		j.sim();
		
		Vadafone v=new Vadafone();
		v.sim();
		v.sms();
		v.Internet();

	}

}

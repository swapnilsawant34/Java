package vehicle_inheritance;
import java.util.*;
class Interest
{
	int pamt;int irate; int dur;
	void setPRD(int pamt,int irate,int dur)
	{
		this.pamt=pamt; //principal amount
		this.irate=irate;//rate
		this.dur=dur;     //duration
	}


}

class CalculateInterest extends Interest
{
	void callIntrest()
	{
		float Interest;
		Interest=(pamt*irate*dur)/100;
		
		System.out.println("Loan Interest rate is:"+Interest);
		
		
	}
}

public class InterestApp {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	int pamt;int irate;int dur;
	System.out.println("Enter the principal amount,rate and duration");
	pamt=xyz.nextInt();
	irate=xyz.nextInt();
	dur=xyz.nextInt();
	
	CalculateInterest I=new CalculateInterest();
	I.setPRD(pamt, irate, dur);
	I.callIntrest();
	
	

	}

}

package vehicle_inheritance;
import java.util.*;
class Per
{
	String name;int id; String address;String year;
	int agg;int s[];float per;
	
	void CalPer(int s[])
	{
		this.s=s;
		for(int i=0;i<s.length;i++)
		{
			agg=agg+s[i];
			
		}
		per=agg/6;
		
	}
	
}
class CSE extends Per
{
	CSE(String name,int id, String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void cseper()
	{
		
		
		System.out.println("CSE student percentage are:"+per);
	}
	
}

class ETC extends Per
{
	ETC(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
		
	}
	
	void etcper()
	{
		
		System.out.println("ETC student percentage are:"+per);
		
	}
	
}


public class ResultApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int s[]=new int[6];
		String name;int id; String address;String year;
		System.out.println("Enter the name,address,year,id for CSE student");
		name=xyz.nextLine();
		//xyz.nextLine();
		address=xyz.nextLine();
		year=xyz.nextLine();
		//xyz.nextLine();
		id=xyz.nextInt();
		
	
		System.out.println("Enter the six subject marks for CSE students");
		for(int i=0;i<s.length;i++)
		{
			s[i]=xyz.nextInt();
		}
		
		CSE c=new CSE(name,id,address,year);
		c.CalPer(s);
		c.cseper();
		
		
		
		System.out.println("Enter the name,address,year,id for ETC student");
		name=xyz.nextLine();
		
		//xyz.nextLine();
		address=xyz.nextLine();
		//xyz.nextLine();
		year=xyz.nextLine();
		xyz.nextLine();
		id=xyz.nextInt();
		
		System.out.println("Enter the six subject marks for ETC students");
		for(int i=0;i<s.length;i++)
		{
			s[i]=xyz.nextInt();
		}
		
		
		ETC e=new ETC(name,id,address,year);
		e.CalPer(s);
		e.etcper();

	}

}

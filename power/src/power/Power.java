package power;
import java.util.*;
class PowerApp{
	int base,index,p=1;
	
	void setValue(int base,int index)
	{
		this.base=base;
		this.index=index;
		
	}
	
	int getPower()
	{
		for(int i=1;i<=index;i++)
		{
			p=p*base;
			
		}
		return p;
		
	}
	
} 


public class Power {

	public static void main(String[] args) {
		PowerApp p=new PowerApp();
		Scanner xyz= new Scanner(System.in);
		int base,index;
		System.out.println("Enter the base and index\n");
		 base=xyz.nextInt();
		 index=xyz.nextInt();
		
		 p.setValue(base,index);
		 int result=p.getPower();
		 
		 System.out.println("Power is "+result);

	}

}

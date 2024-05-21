package MultiThreading_Practical;
import java.util.*;
class Even extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			if(i%2==0)
			{
				System.out.println("Even number="+i);
				Thread.sleep(1000);
			}
			
		}catch(Exception ex){
			System.out.println("Error is"+ex);
			
		}
	}
	
	
}

class Odd extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			if(i%2==1)
			{
				System.out.println("Odd number="+i);
				Thread.sleep(10000);
			}
			
		}catch(Exception ex){
			System.out.println("Error is"+ex);
			
		}
	}
}
public class Even_Odd_MultiThreading {

	public static void main(String[] args) {
		Even e=new Even();
		e.start();
		
		Odd o=new Odd();
		o.start();

	}

}

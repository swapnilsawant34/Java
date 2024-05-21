package MultiThreading_Practical;
import java.util.*;

class EvenNum extends Thread
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

class OddNum extends Thread
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

class pattern extends Thread
{
	public void run()
	{
		try {
	 
	        for (int i=0; i<5; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
	            { 
	                System.out.print(" "); //print space
	              
	            for (int j=0; j<=i; j++ ) //inner loop for number of columns
	            { 
	                System.out.print("*  "); //print star
	            } 
	           // char ch='A';
	  
	            System.out.println(); //ending line after each row
	            Thread.sleep(100);
	            } }
	        catch(Exception ex)
	            {
	    			System.out.println("Error is"+ex);
	    			
	    		}

   }
}


public class Menu_Driven_Threading {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the choice");
		int choice=xyz.nextInt();
		switch(choice)
		{
		case 1:
		   EvenNum e=new EvenNum();
		   e.start();
		
		   OddNum o=new OddNum();
		   o.start();
		break;
		case 2:
			pattern p=new 	pattern();
			p.start();
			
		break;

	}

}
}

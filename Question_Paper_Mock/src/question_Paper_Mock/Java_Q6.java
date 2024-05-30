package question_Paper_Mock;
import java.util.*;



class EvenNum extends Thread  //thread class
{
	public void run()  //run() is used to execute thread logic
	{
		try {
			for(int i=1;i<=10;i++)
			if(i%2==0)
			{
				System.out.println("Even number="+i);  //print 2 to 10 even numbers
				Thread.sleep(10000);  //delay with 10000 millisecond
			}
			
		}catch(Exception ex){
			System.out.println("Error is"+ex);
			
		}
	}
	
	
}


public class Java_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EvenNum e=new EvenNum();
		   e.start();  //start() method is used to start the thread
	}

}

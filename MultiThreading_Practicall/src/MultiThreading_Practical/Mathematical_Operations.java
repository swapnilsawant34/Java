package MultiThreading_Practical;

import java.util.*;

class A1 extends Thread {
	A1(int x,int y)
	{
		public void  run() {
		try {
		
			int sum=x+y;
			System.out.println("Sum beetween two numbers is:"+sum);
			
			int diff=x-y;
			System.out.println("Diffrence beetween two numbers is:"+diff);
			Thread.sleep(1000);
			
		}catch(Exception ex)
		{
		System.out.println(""+ex);
	      }   
	}
 }
}

class A2 extends Thread {

}

public class Mathematical_Operations {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x = xyz.nextInt();
		System.out.println("Enter the Second number:");
		int y = xyz.nextInt();
		A1 a = new A1(x, y);
		a.start();

	}

}

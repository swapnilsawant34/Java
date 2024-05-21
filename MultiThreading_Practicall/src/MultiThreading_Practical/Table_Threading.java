package MultiThreading_Practical;
import java.util.*;
class table extends Thread
{
	void showTable(int x)
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%d X %d=%d\n",x,i,i*x);
				Thread.sleep(10000);
			}
			
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}

public class Table_Threading {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no=xyz.nextInt();
		table t=new table();
		t.showTable(no);
		t.start();

	}

}

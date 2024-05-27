package imp_code1;
import java.util.*;

/*class A
{
	
  static void show() {
	  System.out.println("Parent");
  }	
}
class B extends A{
	static void show() {
		System.out.println("Child");
	}
}

public class Demo {

	public static void main(String[] args) {
		A b1=new B();
		b1.show();

	}

}*/




/*
 * public class Demo {
 * 
 * public static void main(String[] args) { 
 * int x[]= {7,8,9}; int y[]= {7,7,7};
 * System.out.println(Arrays.compare(x, y)+ " "+Arrays.mismatch(x, y));
 * 
 * }
 * 
 * }
 */

class Add{
	int a,b;
	
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
	
	void showadd()
	{
		System.out.printf("%d",a+b);
	}
}
public class Demo {
	 
	  public static void main(String[] args) 
	  {
		  Scanner sc=new Scanner(System.in);
		  Add ad=new Add();
		  System.out.println("enter the numbers");
		  int a=sc.nextInt();
		  int b=sc.nextInt();
		  ad.setValue(a, b);
		  ad.showadd();
		  
	  
	    }
	  
	  }


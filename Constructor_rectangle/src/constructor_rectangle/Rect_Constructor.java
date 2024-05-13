package constructor_rectangle;
import java.util.*;
//program based on constructor.
class Rectangle
{
	int length,breadth;
	Rectangle() //without parameter
	{
		length=0;
		breadth=0;
	}
	
	int getArea1()
	{
		return length*breadth;
	}
	
	Rectangle(int length,int breadth)   // with two parameter
	{
		this.length=length;
		this.breadth=breadth;
	
	}
	int getArea2()
	{
		return length*breadth;
	}
	
	Rectangle(Rectangle a)
    {
    	this.length=a.length;
		this.breadth=a.breadth;
    
     	
	}
	 
	 int getArea3()
	{
		return length*breadth;
		
	}
	
}

public class Rect_Constructor {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		int length,breadth;
		
		Rectangle r1=new Rectangle();
		int result1=r1.getArea1();
		System.out.println("Area without parameter is "+result1);
		
		System.out.println("Enter the length and breadth");
		length=xyz.nextInt();
		breadth=xyz.nextInt();
		
		Rectangle r2=new Rectangle(length,breadth);
		int result2=r2.getArea2();
		System.out.println("Area with parameter is "+result2);
		
		Rectangle r3=new Rectangle(r2);
		int result3=r3.getArea3();
		System.out.println("Area with having one number as a parameter is "+result3);

	}

}

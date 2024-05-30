package abstraction_and_interface;
import java.util.*;

abstract class Area
{
	abstract void showArea();
	
}
class Circle extends Area
{
	int radius;
	void SetRadius(int rad)
	{
		radius=rad;
	}
	void showArea()
	{
		float c_area=3.14f*radius*radius;
		System.out.println("Area of Circle is:"+c_area);
	}
}

class Reactangle extends Area
{
	int l,w;
	void setLengthWidth(int len,int wid)
	{
		l=len;
		w=wid;
		
	}
	void showArea()
	{
		int r_area=l*w;
		System.out.println("Area of Reactangle is:"+r_area);
		
	}
	
}



public class AreaApplication {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	int radius;
	int len,wid;
	System.out.println("Enter the radius of circle");
	radius=xyz.nextInt();
	
	System.out.println("Enter the length and width");
	len=xyz.nextInt();
	wid=xyz.nextInt();
	
	Circle c=new Circle();
	c.SetRadius(radius);
	c.showArea();
	
	Reactangle r=new Reactangle();
	r.setLengthWidth(len, wid);
	r.showArea();

	}

}

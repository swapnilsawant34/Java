package question1;
import java.util.*;
class Area
{
	
	float calArea(float radius)
	{
		//this.radius=radius;
		return 3.14f*radius*radius;
	}
	
	int calArea(int length,int width)
	{
		//this.length=length;
		//this.width=width;
		return length*width;
		
	}
}

public class question4 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		float radius;
		int length;int width;
		System.out.println("Enter the radius of circle");
		radius=xyz.nextFloat();
		
		
		System.out.println("Enter the len and width");
		length=xyz.nextInt();
		width=xyz.nextInt();
		
		Area ar=new Area();
		
		
		float result1=ar.calArea(radius);
		
		System.out.println("Area of cicle"+result1);
		
        int result2=ar.calArea(length,width);
		
		System.out.println("Area of rectangle"+result2);
		
		
		
		

	}

}

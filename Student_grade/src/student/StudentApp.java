package student;
import java.util.*;

class Student
{
	int s[],agg;
	float per;
	void setSubMarks(int s[])
	{
		this.s=s;
		
	}
	
	void calculatePer()
	{
		for(int i=0;i<s.length;i++)
		{
		agg=agg+s[i];
		}
		
		per=agg/6;
		
		System.out.println("Percentage is "+per);
		
	}
	void checkGrades()
	{
		if(per>75 && per<=100)
		{
			System.out.println("Student in distinction");
		}
		
		if(per>60 && per<=75)
		{
			System.out.println("Student in first division");
		}

		if(per>=50 && per<=60)
		{
			System.out.println("Student in second division");
		}

		if(per>40 && per<=50)
		{
			System.out.println("Student in third division");
		}

		if(per<40)
		{
			System.out.println("Student failed");
		}
		
		
		
		
	}
	
}


public class StudentApp {

	public static void main(String[] args) {
		
		Student st= new Student();
		
		Scanner xyz= new Scanner(System.in);
		
		int s[]= new int[6];
		
		 System.out.println("Enter the Six subject marks");
		for(int i=0;i<s.length;i++)
		{
			s[i]=xyz.nextInt();
		
		}

	
		
		st.setSubMarks(s);
		st.calculatePer();
		st.checkGrades();

	}

}

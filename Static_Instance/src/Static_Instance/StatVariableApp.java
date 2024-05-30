package Static_Instance;
import java.util.*;
class Student
{
	int roll_no;
	String name;
	static String college_name="SIAC";
	
	Student(int roll_no,String name)
	{
		
		this.roll_no=roll_no;
		this.name=name;
	}
	
	void display()
	{
		System.out.println("Roll number is "+roll_no);
		System.out.println("Student name is "+name);
		System.out.println("College name is "+college_name);
		
	}

	
	

}

public class StatVariableApp {

	public static void main(String[] args) {
		
		 
		 Scanner xyz= new Scanner(System.in);
		 
		 int roll;
		 String name;
		 Student s[]= new Student[5]; //array of object
		 
		 for(int i=0;i<5;i++)
		 {
			 
		 System.out.println("Enter the id and name");
		 roll=xyz.nextInt();
		 xyz.nextLine();
		 name=xyz.nextLine();
		 s[i]= new  Student(roll,name);
		 }
		 System.out.println("Display the detailes");
		 for(int i=0;i<5;i++)
		 {
		 s[i].display();
		 }

	}

}

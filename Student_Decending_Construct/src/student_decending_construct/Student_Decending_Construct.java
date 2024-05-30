package student_decending_construct;
import java.util.*;
class Student
{
	int id;
	String name;
	String address;
	char ch[];
	
	
	
	Student(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		 ch=name.toCharArray();
		this.address=address;
	}
	
	void ascending()
	{
		for(int i=0;i<name.length();i++)
		{
			for(int j=i+1;j<name.length();j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					     ch[i]=ch[j];       //sort the string 
					     ch[j]=temp;
				}
			}
			
		}
		System.out.println(""+ch+id+address);
		
	}
	
	
}



public class Student_Decending_Construct {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	
	
	int id;
	String name;
	String address;
	
	Student s[]=new Student[5];
	
	for(int i=0;i<s.length;i++)
	{
		
		
		System.out.println("Enter the student id,name,address");
		  name=xyz.nextLine();
		   xyz.nextLine();
		   id=xyz.nextInt();
		
		   address=xyz.nextLine();
		      xyz.nextLine();
		   s[i]=new Student(id,name,address);
		  
	}
	
	for(int i=0;i<s.length;i++)
	{
		 s[i].ascending();	
	}
	}
		
		
		

	}



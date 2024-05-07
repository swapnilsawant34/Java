package collection_practical;
import java.util.*;
/*WAP to create Collection of students means here we need to create POJO class of student 
class with field id,name,per and perform following operation on it 
case 1: add new student in Vector 
case 2: show all students from Vector
case 3: delete student using its id
case 4: Search student using its id or name 
case 5: Arrange all students record in descending order 
case 6: find second and third topper. 
case 7: find student who having minimum marks
case 8 : find student whose marks between 50 to 70 percentage
case 9: find student whose name is same 
case 10: find student who having same marks and same name 
 * 
 */


class Student{
	
	private int  id;
	private String name;
	private int per;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
}

public class StudentDriverApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		Vector v=new Vector();
		int size;
		int id,per;
		String name;
		System.out.println("Enter the student count");
		size=xyz.nextInt();
		
		Student s[]=new Student[size];
		
		for(int i=0;i<s.length;i++)
		{
			xyz.nextLine();
			s[i]=new Student();
			System.out.println("Enter the student name,id and percentage");
			
			
			 name=xyz.nextLine();
			 id=xyz.nextInt();
			
			 per=xyz.nextInt();
			
			s[i].setId(id);
			s[i].setName(name);
			s[i].setPer(per);
			
			v.add(s[i]);
		}
		System.out.println("Student list");
		for(Object obj:v) {
			Student std=(Student)obj;
			
			System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getPer());
		}
		System.out.println("Enter the choice");
		int choice=xyz.nextInt();
		switch(choice)
		{
		case 1:
			Student s1[]=new Student[1];
			
			
			System.out.println("Enter the name id and per of stduent want to add");
			
			for(int c=0;c<s1.length;c++) {
			s1[c]=new Student();
			xyz.nextLine();
			 name=xyz.nextLine();
			 id=xyz.nextInt();
			
			 per=xyz.nextInt();
			
			s1[c].setId(id);
			s1[c].setName(name);
			s1[c].setPer(per);
			v.add(s1[c]);
			
			}
			
			System.out.println("Student list after adding");
			
			for(Object obj:v) {
				Student std=(Student)obj;
				System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getPer());
			}
			break;
			
		case 2:
              System.out.println("Student list");
			
			for(Object obj:v) {
				Student std=(Student)obj;
				System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getPer());
			}
			break;
			
		case 3:
			System.out.println("Delete student using its id");
			
			Iterator i=v.iterator();
			
			System.out.println("Enter the id to delete student record");
			int id1=xyz.nextInt();
			while(i.hasNext())
			{
				Object obj=i.next();
				Student std=(Student)obj;
				if(id1==std.getId())
				{
					i.remove();
				}
				
				
			}
			   System.out.println("Student list after deleting");
				
				for(Object obj:v) {
					Student std=(Student)obj;
					System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getPer());
				}
				break;
		case 4:
			System.out.println("Search student using id or name");
			
			Iterator i1=v.iterator();
			System.out.println("Enter the id to search the student");
			int id2=xyz.nextInt();
			boolean b=false;
			while(i1.hasNext())
		   {
				Object obj=i1.next();
				Student std=(Student)obj;
			
			//boolean b=v.contains(id2);
				
			if(id2==std.getId())
			{
				b=true;
				break;
			}
		 }
			if(b)
			{
				System.out.println("Student found");
			}
			else {
				System.out.println("Student not found");
			}
				
		 break;
		 
		case 5:
			System.out.println("Arrange all students record in deceding order");
			for(int j=0;j<v.size();j++)
			{
				for(int k=j+1;k<v.size();k++)
				{
					Student std1=(Student)v.get(j); //pahilyanda vector madhun percentage data baher kadhla then 
					                                 //student object to object data baher kadhla. 
					int per1=std1.getPer();
					
					Student std2=(Student)v.get(k);
					int per2=std2.getPer();
					
					if(per1<per2)   //decending logic
					{
						v.set(k,std1);
						v.set(j,std2);
					}

					
				}
			}
			
			 System.out.println("Student list after sorting");
				
				for(Object obj:v) {
					Student std=(Student)obj;
					System.out.println(std.getId()+"\t"+std.getName()+"\t"+std.getPer());
				}
				
				break;
				
		case 6:
			System.out.println("Find the second topper and third topper");
			for(int j=0;j<v.size();j++)
			{
				for(int k=j+1;k<v.size();k++)
				{
					Student std1=(Student)v.get(j); 
					int per1=std1.getPer();
					
					Student std2=(Student)v.get(k);
					int per2=std2.getPer();
					
					if(per1<per2)   //decending logic
					{
						v.set(k,std1);
						v.set(j,std2);
					}

					
				}
			}
			System.out.println("Second topper of class");
			Student std1=(Student)v.get(1);
			System.out.println(std1.getId()+"\t"+std1.getName()+"\t"+std1.getPer());
			
			System.out.println("third topper of class");
			Student std2=(Student)v.get(2);
			System.out.println(std2.getId()+"\t"+std2.getName()+"\t"+std2.getPer());
			
			break;
			
		case 7:
			System.out.println("Find student who having minimum marks");
			
			Student std =(Student)v.get(0);
			int min=std.getPer();
			int k=0;
			for(int l=0;l<v.size();l++)
			{
				Student std11=(Student)v.get(l);
				int m=(int)std11.getPer();
				
				if(min>m)
				{
					min=m;
					k=l;
				}
			}
			Student std11=(Student)v.get(k);
			System.out.println(std11.getId()+"\t"+std11.getName()+"\t"+std11.getPer());
			
			break;
		case 8:
			System.out.println("Find student whose marks between 50 to 70 percentage");
			
			for(int n=0;n<v.size();n++)
			{
				
					Student std3=(Student)v.get(n); 
					int percent=(int)std3.getPer();
					
					
					
					if(percent>=50 && percent<=70)
					{
						Student std4=(Student)v.get(n); 
						System.out.println(std4.getId()+"\t"+std4.getName()+"\t"+std4.getPer());
					}
			
			
			
		     }
			break;
		
		case 9:
			System.out.println("Find the student who's name is same");
			
			for(int x=0;x<v.size();x++)
			{
				for(int y=x+1;y<v.size();y++)
				{
					Student std5=(Student)v.get(x);
					String fname=(String) std5.getName();
					
					Student std6=(Student)v.get(y);
					String lname=(String) std6.getName();
					
					if(fname.equals(lname))
					{
						System.out.println(std5.getId()+"\t"+std5.getName()+"\t"+std5.getPer());
						System.out.println(std6.getId()+"\t"+std6.getName()+"\t"+std6.getPer());
					}
				}
			}
			break;
			
		case 10:
			

			for(int x=0;x<v.size();x++)
			{
				for(int y=x+1;y<v.size();y++)
				{
					Student std5=(Student)v.get(x);
					String fname=(String) std5.getName();
					int per1=(int)std5.getPer();
					
					Student std6=(Student)v.get(y);
					String lname=(String) std6.getName();
					int per2=(int)std6.getPer();
					
					if(fname.equals(lname) && (per1==per2))
					{
						System.out.println(std5.getId()+"\t"+std5.getName()+"\t"+std5.getPer());
						System.out.println(std6.getId()+"\t"+std6.getName()+"\t"+std6.getPer());
					}
				}
			}
			break;
			
			default:
			{
				System.out.println("invalid choice");
			}

	}
	}
}

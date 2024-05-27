package pojo_class;
import java.util.*;
//find out topper of the class.

class Student
{
	private int rno;
	private String name;
	private String branch;
	private int smark[];
	private int per;
	Student(String name,String branch,int rno,int smark[])
	{
		this.name=name;
		this.branch=branch;
		this.rno=rno;
		this.smark=smark;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int[] getSmark() {
		return smark;
	}
	public void setSmark(int[] smark) {
		this.smark = smark;
		int sum=0;
		for(int i=0;i<smark.length;i++)
		{
			sum=sum+smark[i];
		}
		per=sum/5;
	}
	public int getPer()
	{
		return per;
	}
	public String getRoll() {
		
		return null;
	}
	public int getMarks() {
		// TODO Auto-generated method stub
		return 0;
	}
}
class GoldMedelist
{
	Student student[];
	void acceptinfi(Student student[])
	{
		this.student=student;
	}
	void displaallrecords()
	{
		for(int i=0;i<student.length;i++)
		{
			System.out.println("Student name is "+student[i].getName());
			System.out.println("Student roll number is "+student[i].getRno());
			System.out.println("Student branch is "+student[i].getBranch());
			System.out.println("Student marks");
			int a[]=student[i].getSmark();
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j]+"\t");
			}
			System.out.println();
		}
	}
	void topper()
	{
		int maxper=student[0].getPer();
		int topper=0;
			for(int k=0;k<student.length;k++)
			{
				if(student[k].getPer()>maxper)
				{
					maxper=student[k].getPer();
					topper=k;
				}
			}
			System.out.println(" topper Student name is "+student[topper].getName());
			System.out.println("topper Student roll number is "+student[topper].getRno());
			System.out.println("topper Student branch is "+student[topper].getBranch());
			System.out.println("Student marks");
			int a[]=student[topper].getSmark();
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j]+"\t");
			}
			System.out.println();
		}		
}

public class StudentApp {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			Student std[]=new Student[3];
			for(int i=0;i<std.length;i++)
			{
				System.out.println("Enter the name branch roll no and marks");
				String name=sc.next();
				String branch=sc.next();
				int rno=sc.nextInt();
				int m[]=new int [5];
				System.out.println("Enter the marks");
				for(int j=0;j<m.length;j++)
				{
					m[j]=sc.nextInt();
				}
				std[i]=new Student(name,branch,rno,m);
			}
			GoldMedelist gm=new GoldMedelist();
				gm.acceptinfi(std);
				gm.displaallrecords();
				gm.topper();

		}

	}



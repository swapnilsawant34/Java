package pojo_class;
import java.util.*;
class Students
{
	private int roll;
	private String name;
	private String branch;
	private int marks[];
	private int total;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
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
	public int getMarks() {
		return total;
	}
	public void setMarks(int[] marks) {
		int sum=0;
		total=0;
		this.marks = marks;
		for(int i=0;i<5;i++) {
			sum=sum+marks[i];
		}
		total=sum;
	}
	
}
class Goldmedalist{
	Student student[];
	void set(Student student[]) {
		this.student=student;
	}
	void display() {
		for(int i=0;i<student.length;i++) {
			System.out.println("\t"+student[i].getRoll()+"\t"+student[i].getName()+"\t"+student[i].getBranch()+"\t");
		}
	}
	
	void topper() {
		int k=0;
		int max=student[0].getMarks();
		for(int i=1;i<3;i++) {
			if(student[i].getMarks()>max) {
				max=student[i].getMarks();
			}
		}
		for(int j=0;j<3;j++) {
			if(max==student[j].getMarks()) {
				System.out.println("\t"+student[j].getRoll()+"\t"+student[j].getName()+"\t"+student[j].getBranch()+"\t"+max);
			}
		}
		
	}
	public void setMarks(Students[] s) {
		// TODO Auto-generated method stub
		
	}
}
public class Topper_Student {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		Students[] s=new Students[3];
		Goldmedalist g=new Goldmedalist();
		int roll = 0;
		String name = null;
		String branch = null;
		int a[]=new int[5];
		System.out.println("Enter details");
		for(int i=0;i<s.length;i++) {
			
			s[i]=new Students();
			roll=sc.nextInt();
			sc.nextLine();
			name=sc.nextLine();
			branch=sc.nextLine();
			System.out.println("Enter 5 marks");
			for(int j=0;j<a.length;j++) {
				a[i]=sc.nextInt();
			}
			s[i].setRoll(roll);
			s[i].setName(name);
			s[i].setBranch(branch);
			s[i].setMarks(a);
			
			
			
			
		}
		g.setMarks(s);
		g.display();
	    g.topper();
			
		
		
		

	
		


	}
	

}

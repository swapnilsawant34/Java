package Encapsulation;

import java.util.Scanner;

class Exam
{
	private String name,time;
	private String total,pass;
	
	public void setDetails(String name,String time,String total,String pass)
	{
		this.name=name;
		this.time=time;
		this.total=total;
		this.pass=pass;
		
	}
	void verifyStudent(String examcode)
	{
		if(examcode.equals("JE12345"))
		{
			System.out.println(name+"\t"+time+"\t"+total+"\t"+pass);
		}
		else {
			System.out.println("Invalid Student");
		}
	}
}
public class encapsulation_example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       Exam e=new Exam();
       e.setDetails("JExam","10AM","100","50");
       e.verifyStudent("345");
	}

}

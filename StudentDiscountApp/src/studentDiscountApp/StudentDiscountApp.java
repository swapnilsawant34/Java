package studentDiscountApp;
import java.util.*;
class Student
{
	private int id;
	private String name;
	private float per;
	private int totalFees;
	private int disFees;
	private int actualPaidFees;
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
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public int getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(int totalFees) {
		this.totalFees = totalFees;
	}
	public int getDisFees() {
		return disFees;
	}
	public void setDisFees(int disFees) {
		this.disFees = disFees;
	}
	public int getActualPaidFees() {
		return actualPaidFees;
	}
	public void setActualPaidFees(int actualPaidFees) {
		this.actualPaidFees = actualPaidFees;
	}
	
}
class DiscountFees
{
	Student student;
	void setStudent(Student student)
	{
		this.student=student;
	}
	
	void checkDiscountEligibity()
	{
		String name=student.getName();
		int id=student.getId();
		float per=student.getPer();
		int disFees=student.getDisFees();
		int actualPaidFees=student.getActualPaidFees();
		int totalFees=student.getTotalFees();
		
		
		if(per>60)
		{
			disFees=(totalFees*30)/100;
		}
		actualPaidFees=totalFees-(totalFees*30)/100;
		
		System.out.println(name+"\t" +id+"\t" +per+"\t" +disFees+"\t" +actualPaidFees+"\t" +totalFees);
		
	}
	
	void show()
	{
		
		
	}
	
}


public class StudentDiscountApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		DiscountFees d=new DiscountFees();
		Student s=new Student();
		s.setId(1);
		s.setName("AAA");
		s.setPer(75);
		s.setTotalFees(10000);
		
		d.setStudent(s);
		d.checkDiscountEligibity();
		

	}

}

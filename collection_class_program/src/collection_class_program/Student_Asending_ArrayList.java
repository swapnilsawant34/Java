/*Write a program to create Pojo class name as Employee with field id,name and salary and store 5 objects in 
 * ArrayList collection and sort
 * Employee record by salary in descending order
 * 
 * 
 */

package collection_class_program;
import java.util.*;


class Employee1{
	private int id;
	private String name;
	private int sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
public class Student_Asending_ArrayList {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList al=new ArrayList();
		int size;
		System.out.println("Enter the count:");
		size=xyz.nextInt();
		
		Employee1 emp[]=new Employee1[size];   //array of reference
		for(int i=0;i<emp.length;i++)
		{
			
			emp[i]=new Employee1();       //array of object
			System.out.println("Enter the Employee id,name and Salary");
			int id=xyz.nextInt();
			xyz.nextLine();
			String name=xyz.nextLine();
			
			int sal=xyz.nextInt();
			
			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setSal(sal);
			al.add(emp[i]);
		}
		System.out.println("Employee list before descending:");
		for(Object obj:al)
		{
			Employee1 e=(Employee1)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		
		for(int i=0;i<al.size();i++)
		{
			
			for(int j=i+1;j<al.size();j++)
			{
				Employee1 emp1=(Employee1)al.get(i); //pahilyanda arraylist madhun salary data baher kadhla then 
				                                 //employee object to object data baher kadhla. 
				int sal1=emp1.getSal();
				
				Employee1 emp2=(Employee1)al.get(j);
				int sal2=emp2.getSal();
				
				if(sal1<sal2)   //decending logic
				{
					
					al.set(i,emp2);   //emp2--next element
					al.set(j,emp1);    //emp1--prev element
					
				}

				
			}
		}
		System.out.println("Employee list after descending:");
		for(Object obj:al)
		{
			Employee1 e=(Employee1)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}

	}

}

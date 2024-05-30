package question_Paper_Mock;

import java.util.*;


class Employee{        //crete pojo class of employee
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
public class Java_Q1 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList al=new ArrayList();
		int size;
		System.out.println("Enter the count:");
		size=xyz.nextInt();
		
		Employee emp[]=new Employee[size];   //array of reference
		for(int i=0;i<emp.length;i++)
		{
			
			emp[i]=new Employee();       //array of object
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
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		
		for(int i=0;i<al.size();i++)
		{
			
			for(int j=i+1;j<al.size();j++)
			{
				Employee emp1=(Employee)al.get(i); 
				                                 
				//first of we fetch the data from id then we fetch the employee data object to object
				
				int id1=emp1.getId();
				
				Employee emp2=(Employee)al.get(j);
				
				int id2=emp2.getId();
				
				if(id1>id2)   //Ascending logic
				{
					
					al.set(i,emp2);   //emp2--next element
					al.set(j,emp1);    //emp1--prev element
					
				}

				
			}
		}
		System.out.println("Employee list after ascending:");
		for(Object obj:al)
		{
			Employee e=(Employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}

	}

}

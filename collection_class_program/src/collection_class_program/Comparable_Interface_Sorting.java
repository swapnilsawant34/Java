package collection_class_program;
import java.util.*; //step 1

class Employee implements Comparable   //step2
{
	private int id;
	private String name;
	private int sal;
	Employee(String name, int id, int sal) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
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
	

public int compareTo(Object o) {   //step3   //ascending logic
	Employee emp=(Employee)o;
	if(this.getId()>emp.getId()) {
		return 1;
	}else if(this.getId()<emp.getId()) {
		return -1;
	}else {
		return 0;
	}
	
}

/*
 * logic for decending for id
 * public int compareTo(Object o) {   //step3
	Employee emp=(Employee)o;
	if(this.getId()<emp.getId()) {
		return 1;
	}else if(this.getId()>emp.getId()) {
		return -1;
	}else {
		return 0;
	}
	
}
 */
/*public int compareTo(Object o) {   //step3
	Employee emp=(Employee)o;
	if(this.getSal()>emp.getSal()) {
		return 1;
	}else if(this.getSal()<emp.getSal()) {
		return -1;
	}else {
		return 0;
	}
	
}*/
		

}

public class Comparable_Interface_Sorting {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Employee("ABC",3,1000));
		al.add(new Employee("MNO",4,5000));
		al.add(new Employee("PQR",2,3000));
		al.add(new Employee("STV",5,9000));
		al.add(new Employee("XYZ",1,2000));
		
		System.out.println("Before sorting:");
		for(Object obj:al) {
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
		}
		Collections.sort(al);
		System.out.println("After sorting:");
		for(Object obj:al) {
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
		}

	}

}

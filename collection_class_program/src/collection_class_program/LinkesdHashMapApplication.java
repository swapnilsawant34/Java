package collection_class_program;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Student
{
	private int id;
	private String name;
	private int per;
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
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
	
	
}
public class LinkesdHashMapApplication {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Student> lh=new LinkedHashMap<Integer,Student>();
		Student s[]=new Student[2];
		do {
			Scanner xyz=new Scanner(System.in);
			for(int i=0;i<s.length;i++)
			{
				s[i]=new Student();
				System.out.println("Enter the name is and per");
				
				int id=xyz.nextInt();
				xyz.nextLine();
				String name=xyz.nextLine();
				int per=xyz.nextInt();
				
				s[i].setId(id);
				s[i].setName(name);
				s[i].setPer(per);
				lh.put(i,s[i]);
			}
			System.out.println("Dispaly the record");
			Set <Entry<Integer,Student>> keys=lh.entrySet();
			for(Entry e:keys)
			{
				Student stud=(Student)e.getValue();
				System.out.println(e.getKey()+"\t"+stud.getId()+"\t"+stud.getName()+"\t"+stud.getPer());
			}
			System.out.println("Enter the id");
			int Id=xyz.nextInt();
			//boolean b=lh.containsKey(Id);
			if(lh.containsKey(Id))
			{
				System.out.println("Id is prenet in map");
			}
			else
			{
				System.out.println("Id is not present");
			}
		}while(true);

	}

}

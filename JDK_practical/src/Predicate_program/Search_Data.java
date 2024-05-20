package Predicate_program;
//Use predicate check condition for collection.

import java.util.*;
import java.util.function.*;
class User{
	private String name;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public User(String name,String role) {
		this.name=name;
		this.role=role;
		
	}
}
public class Search_Data {

	public static void main(String[] args) {
		ArrayList<User> list=new ArrayList<User>();
		
		list.add(new User("Ram","Employee"));
		list.add(new User("Shyam","Clerk"));
		list.add(new User("Ganesh","Admin"));
		list.add(new User("Rajesh","Employee"));
		list.add(new User("Raju","Admin"));
		
		Predicate<User> p=new Predicate<User>() {
			public boolean test(User t) {
				return t.getRole().equals("Admin");
				
			}
		};
		
		search(list,p);
	}
	
	public static void search(ArrayList<User>list,Predicate<User> p) {
		for(User u:list) {
			if(p.test(u)) {
				System.out.println(u.getName()+"\t"+u.getRole());
			}
		}
		

}
}


/*class User{
	private String name;
	private String role;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public User(String name,String role) {
		this.name=name;
		this.role=role;
		
	}
}
public class Search_Data {

	public static void main(String[] args) {
		ArrayList<User> list=new ArrayList<User>();
		
		list.add(new User("Ram","Employee"));
		list.add(new User("Shyam","Clerk"));
		list.add(new User("Ganesh","Admin"));
		list.add(new User("Rajesh","Employee"));
		list.add(new User("Raju","Admin"));
		
		
		
		search(list,(User t)->t.getRole().equals("Admin"));
	}
	
	public static void search(ArrayList<User>list,Predicate<User> p) {
		for(User u:list) {
			if(p.test(u)) {
				System.out.println(u.getName()+"\t"+u.getRole());
			}
		}
		

}
}*/

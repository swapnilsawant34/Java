package collection_class_program;
import java.util.*;
public class HashApp {

	public static void main(String[] args) {
	   ArrayList al=new ArrayList();
	   al.add(10);
	   al.add(20);
	   al.add(30);
	   al.add(40);
	   al.add(50);
	   al.add(20);
	   
	   HashSet hs=new HashSet(al);
	   al.clear();//remove duplicate.
	   al.addAll(hs);
	   System.out.println(al);
	   

	}

}

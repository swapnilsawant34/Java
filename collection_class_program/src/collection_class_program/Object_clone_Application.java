package collection_class_program;
import java.util.*;
class Square implements Cloneable{
	int no;
	void setvalue(int x) {
		no=x;
	}
	void showSquare() {
		System.out.printf("Square is %d\n",no*no);
	}
	Square getSquare() throws CloneNotSupportedException{  //step 3
		Object obj=this.clone();
		Square s=(Square)obj;
		return s;
		
		//return (Square)this.clone();
	}
}
public class Object_clone_Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner xyz=new Scanner(System.in);
		Square s1=new Square();
		s1.setvalue(10);
		Square s2=s1.getSquare();
		s2.setvalue(5);
		s1.showSquare();
		
		

	}

}
/*if we want to perform object clone in java we have following steps.
1) add java.lang package in application
2) Create user defined class and implements Cloneable interface 
Note: Cloneable is marker interface in java 
Q. what is marker interface?
Marker interfaces means interfaces having some special run time enviourment provided by JVM

 * 3) Create one user define method and return same class object from it and handle 
CloneNotSupportedException
 * 
 */

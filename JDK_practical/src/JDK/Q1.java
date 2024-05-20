package JDK;
import java.util.*;

/*interface A{                    //1.static method
	static void show() {
		System.out.println("Show method");
	}
}
public class Q1 {

	public static void main(String[] args) {
		A.show();

	}

}*/
interface A{
	default void show() {                         //2.default method.
		System.out.println("Show method");
	}
}
class B implements A{
	
	
}
public class Q1 {

	public static void main(String[] args) {
	           B b1=new B();
	           b1.show();
           	}
}


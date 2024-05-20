//Data fetching using consumer.
//1.consumer interface using implementation technique or user define class
//2.consumer interface using  anonymous inner class 
//3.consumer interface using   lambda expression

package JDK;
import java.util.*;
import java.util.function.Consumer;
/*class Myconsumer implements Consumer<Integer>{
	
	public void accept(Integer t) {
		System.out.println(t);
	}
}
public class Q4 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Myconsumer m=new Myconsumer();
		list.forEach(m);

	}

}*/


/*public class Q4 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Consumer<Integer> c=new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		list.forEach(c);

	}

}*/

public class Q4 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		Consumer<Integer> c=(Integer t) ->{     //lambda expression.
			
				System.out.println(t);
			
		};
		list.forEach(c);

	}

}





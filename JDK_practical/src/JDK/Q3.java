package JDK;

//@FunctionalInterface 
interface ABC{                    
	abstract void show(); // or void show();
}
public class Q3 {

	public static void main(String[] args) {
		ABC a1=()->System.out.println("Show method"); 
		a1.show();
				
				
		
		

	}

}

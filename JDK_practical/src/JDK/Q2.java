package JDK;



@FunctionalInterface 
interface V{                    
	abstract void show(); // or void show();
}
public class Q2 {

	public static void main(String[] args) {
		V v1=new V() {
			public void show() {
				System.out.println("Show method");
			}
		};
		v1.show();

	}

}


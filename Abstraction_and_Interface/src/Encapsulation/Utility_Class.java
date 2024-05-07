package Encapsulation;

class ABCD{
	
	private ABCD() {
		
	
	}
	 static void test()
	{
		 System.out.println("test method from utility class");
		
	}
	 
	 static void show()
		{
			 System.out.println("show method from utility class");
			
		}
	
}

public class Utility_Class {

	public static void main(String[] args) {
		ABCD.test();
		ABCD.show();

	}

}

package Encapsulation;


class ABC{
	
	public static ABC ab;
	private ABC()
	{
		System.out.println("Singleton  class......");
		
	}
	public static ABC getInstance()
	{
		if(ab==null)
		{
			ab=new ABC();
		}
		return ab;
	}
}
public class Singleton_class {

	public static void main(String[] args) {
		ABC a1=ABC.getInstance();
		ABC a2=ABC.getInstance();
		ABC a3=ABC.getInstance();

	}

}

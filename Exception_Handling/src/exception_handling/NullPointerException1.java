package exception_handling;
import java.util.*;
class Test
{
	void show()
	{
		System.out.println("Show method");
	}
}


public class NullPointerException1 {
	static Test t;

	public static void main(String[] args) {
		try{
			t.show();
		}
		catch(Exception ex)
		{
			System.out.println("Error is :"+ex);;
		}
		finally {
			System.out.println("Hello World");
		}

	}

}

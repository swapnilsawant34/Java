package Wrapper_Class_Practical;
import java.util.*;
public class wrapper_classes {

	public static void main(String[] args) {
		Scanner xyz=new Scanner (System.in);
		
		
		int a=100;
		long b=a;      //implicit conversion.
		System.out.printf("A=%d\t B=%d\n",a,b);
		
		int c;
		long d=200;
		c=(int)d;   //explicit conversion.
		System.out.printf("C=%d\t D=%d\n",c,d);

	}

}

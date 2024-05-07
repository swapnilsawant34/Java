package abstraction_and_interface;
import java.util.*;
//Encyption_deryption operation for integer array
interface CryptOperation
{
	void performEncyption(int x[],int key);
}
class Encrytion implements CryptOperation
{
	public void performEncyption(int x[],int key)
	{
		System.out.println("Encypted:");
		for(int i=0;i<x.length;i++)
		{
			x[i]=x[i]+key;
			
			System.out.println("\t"+x[i]);
		}
	}
	
}
class Decryption implements CryptOperation
{
	public void performEncyption(int x[],int key)
	{
		System.out.println("Decypted:");
		for(int i=0;i<x.length;i++)
		{
			x[i]=x[i]-key;
			
			System.out.println("\t"+x[i]);
		}
	}
	
	
	
}


public class Encrypt_Decyept {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int x[]=new int[5];
		System.out.println("Enter the array elements");
		for(int i=0;i<x.length;i++)
		{
			x[i]=xyz.nextInt();
		}
		
		System.out.println("Enter the key");
		int key=xyz.nextInt();
		Encrytion e=new Encrytion();
		e.performEncyption(x,key);
		
		Decryption d=new Decryption();
		d.performEncyption(x,key);

	}

}

package abstraction_and_interface;
import java.util.*;   //note refer this code from wrapper class package
interface Operation
{
	void performEncryption(char ch[],int key);
}
class Encryption1 implements Operation
{
	public void performEncryption(char ch[],int key)
	{
		System.out.println("Encypted:");
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char)(ch[i]+key);
			
			System.out.println("\t"+ch[i]);
		}
	}
	
}

class decryption implements Operation
{
	public void performEncryption(char ch[],int key)
	{
		System.out.println("Decrypted:");
		
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char)(ch[i]-key);
			
			System.out.println("\t"+ch[i]);
		}
	}
	
	
	
}

public class Encrypt_Decyept_Char {

	public static void main(String[] args) 
	{
		Scanner xyz=new Scanner(System.in);
		
		char ch[]; int key;
		System.out.println("Enter the String");
		String x=xyz.nextLine();
		
		ch=x.toCharArray();
		System.out.println("Enter the key");
		 key=xyz.nextInt();
		
		Encryption1 e = new Encryption1();
		e.performEncryption(ch, key);
		
		decryption d=new decryption();
		d.performEncryption(ch, key);
	}

}

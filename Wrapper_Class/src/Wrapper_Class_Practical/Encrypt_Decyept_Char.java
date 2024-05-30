package Wrapper_Class_Practical;

import java.util.Scanner;

interface Operation
{
	void performEncryption(char ch[],int key);
}
class Encryption implements Operation
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

class Decryption implements Operation
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
		
		Encryption e = new Encryption();
		e.performEncryption(ch, key);
		
		Decryption d=new Decryption();
		d.performEncryption(ch, key);
	}

}

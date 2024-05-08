package file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Menudriven {
	public static void main(String []args) throws IOException
	{
		int count = 0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the your choise");
		System.out.println("1:create new file and stored data");
		System.out.println("2:Copy data one file to another file");
		System.out.println("3:convert all data into upper case");
		System.out.println("4:count word...!");
		System.out.println("5:count lines!");
		System.out.println("6:vowels and consonates");
		System.out.println("7:search specific data into the file");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			Scanner sc1=new Scanner(System.in);
			File f=new File("D:\\File_Handling\\write.txt");
			f.createNewFile();
			 boolean b=f.exists();
			 if(b) {
				 System.out.println("insert data into file....!");
				 String data=sc1.nextLine();
				 FileWriter fw=new FileWriter("D:\\File_Handling\\write.txt");
				 fw.write(data);
				 fw.close();
				 System.out.println("data save successful.......!");
			 }
			 else {
				 System.out.println("Some problem............");
			 }

		}
		break;
		case 2:
		{
			File f1=new File("D:\\File_Handling\\\\write.txt");
			File f2=new File("D:\\File_Handling\\write1.txt");
			f1.createNewFile();
			FileReader fr = new FileReader(f1);
			int data;
			while((data=fr.read())!=-1) 
			{
				char ch1=(char)data;
				FileOutputStream obj1=new FileOutputStream(f1,true);
				obj1.write(data);
			}
			System.out.println("data copy from one file to another file");
		}
		break;
		case 3:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			FileReader fr=new FileReader(vk);
			BufferedReader bf=new BufferedReader(fr);
            String str = null;
            String data;
            while((data=bf.readLine())!=null) {
                str=data;
            }
           bf.close();
           fr.close();
           FileWriter fw=new FileWriter(vk);
           fw.write(str.toUpperCase());
           fw.close();
           FileReader fw1=new FileReader(vk);
           bf=new BufferedReader(fw1);
           while((data=bf.readLine())!=null) {
        	   System.out.println(data);
           }
           bf.close();
           fw1.close();
		}
		break;
		case 4:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			FileReader fr=new FileReader(vk);
			BufferedReader bf=new BufferedReader(fr);
			String data2;
        	while((data2=bf.readLine())!=null) {
        	   String[] s=data2.split(" ");
        	   count+=s.length;
        	}
        	System.out.println("Word Count is "+count);
        	bf.close();
        	fr.close();
		}
		break;
		case 5:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			FileReader fr=new FileReader(vk);
			BufferedReader bf=new BufferedReader(fr);
			String data2;
        	while((data2=bf.readLine())!=null) {
        	   String[] s=data2.split("\n");
        	   count+=s.length;
        	}
        	System.out.println("lines Count is "+count);
        	bf.close();
        	fr.close();
		}
		break;
		case 6:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			char data;
			FileReader fr=new FileReader(vk);
        	while((data=(char) fr.read())!=-1) {
        		if((char)data=='a'||(char)data=='e'||(char)data=='i'||(char)data=='o'||(char)data=='u'||(char)data=='A'||(char)data=='E'||(char)data=='I'||(char)data=='O'||(char)data=='U') {
        			count++;
        		}
        	}
        	System.out.println("Vowel count is "+count);
        	count=0;
        	fr.close();
		}
		break;
		case 7:
		{
			Scanner sc1=new Scanner(System.in);
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			System.out.println("Enter the Word for Searching");
        	Object str=sc1.nextLine();
        	FileReader fr=new FileReader(vk);
        	BufferedReader bf=new BufferedReader(fr);
        	boolean b1=false;
        	String data2;
			while((data2=bf.readLine())!=null) {
        	   String[] s=data2.split(" ");
        	   for(String a:s) {
        		   if(a.compareTo((String) str)==0) {
        			   b1=true;
        			   break;
        		   }
        	}
			}
        	if(b1) 
        	{
        		System.out.println("Data is Present");
        	}
        	else {
        		System.out.println("Data is Not Present");
        	}
        	bf.close();
        	fr.close();
		}
		break;
		default:
		{
			System.out.println("invalid input.........!");
		}
		}
	}

}

/*
 * import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class menudrivenprogram {
	public static void main(String []args) throws IOException
	{
		int count = 0;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the your choise");
		System.out.println("case 1:create new file and stored data");
		System.out.println("case 2:Copy data one file to another file");
		System.out.println("case 3:convert all data into upper case");
		System.out.println("case 4:count word...!");
		System.out.println("case 5:count lines!");
		System.out.println("case 6:vowels and consonates");
		System.out.println("case 7:search specific data into the file");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		{
			Scanner sc1=new Scanner(System.in);
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			vk.createNewFile();
			 boolean b=vk.exists();
			 if(b) {
				 System.out.println("insert data into file....!");
				 String data=sc1.nextLine();
				 FileWriter fw=new FileWriter("D:\\filehandaling\\vk\\write.txt");
				 fw.write(data);
				 fw.close();
				 System.out.println("data save successful.......!");
			 }
			 else {
				 System.out.println("Some problem............");
			 }

		}
		break;
		case 2:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			File vk1=new File("D:\\filehandaling\\vk\\write1.txt");
			vk1.createNewFile();
			FileReader fr = new FileReader(vk);
			int data;
			while((data=fr.read())!=-1) 
			{
				char ch1=(char)data;
				FileOutputStream obj1=new FileOutputStream(vk1,true);
				obj1.write(data);
			}
			System.out.println("data copy from one file to another file");
		}
		break;
		case 3:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			FileReader fr=new FileReader(vk);
			BufferedReader bf=new BufferedReader(fr);
            String str = null;
            String data;
            while((data=bf.readLine())!=null) {
                str=data;
            }
           bf.close();
           fr.close();
           FileWriter fw=new FileWriter(vk);
           fw.write(str.toUpperCase());
           fw.close();
           FileReader fw1=new FileReader(vk);
           bf=new BufferedReader(fw1);
           while((data=bf.readLine())!=null) {
        	   System.out.println(data);
           }
           bf.close();
           fw1.close();
		}
		break;
		case 4:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			FileReader fr=new FileReader(vk);
			BufferedReader bf=new BufferedReader(fr);
			String data2;
        	while((data2=bf.readLine())!=null) {
        	   String[] s=data2.split(" ");
        	   count+=s.length;
        	}
        	System.out.println("Word Count is "+count);
        	bf.close();
        	fr.close();
		}
		break;
		case 5:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			FileReader fr=new FileReader(vk);
			BufferedReader bf=new BufferedReader(fr);
			String data2;
        	while((data2=bf.readLine())!=null) {
        	   String[] s=data2.split("\n");
        	   count+=s.length;
        	}
        	System.out.println("lines Count is "+count);
        	bf.close();
        	fr.close();
		}
		break;
		case 6:
		{
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			char data;
			FileReader fr=new FileReader(vk);
        	while((data=(char) fr.read())!=-1) {
        		if((char)data=='a'||(char)data=='e'||(char)data=='i'||(char)data=='o'||(char)data=='u'||(char)data=='A'||(char)data=='E'||(char)data=='I'||(char)data=='O'||(char)data=='U') {
        			count++;
        		}
        	}
        	System.out.println("Vowel count is "+count);
        	count=0;
        	fr.close();
		}
		break;
		case 7:
		{
			Scanner sc1=new Scanner(System.in);
			File vk=new File("D:\\filehandaling\\vk\\write.txt");
			System.out.println("Enter the Word for Searching");
        	Object str=sc1.nextLine();
        	FileReader fr=new FileReader(vk);
        	BufferedReader bf=new BufferedReader(fr);
        	boolean b1=false;
        	String data2;
			while((data2=bf.readLine())!=null) {
        	   String[] s=data2.split(" ");
        	   for(String a:s) {
        		   if(a.compareTo((String) str)==0) {
        			   b1=true;
        			   break;
        		   }
        	}
			}
        	if(b1) 
        	{
        		System.out.println("Data is Present");
        	}
        	else {
        		System.out.println("Data is Not Present");
        	}
        	bf.close();
        	fr.close();
		}
		break;
		default:
		{
			System.out.println("invalid input brother..........!");
		}
		}
	}

}
 * 
 * 
 */

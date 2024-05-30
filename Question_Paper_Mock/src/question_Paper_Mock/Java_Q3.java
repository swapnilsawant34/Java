package question_Paper_Mock;
//Write a program to read files using BufferedReader class and count total number of lines from file , 
//number of words from file 


import java.io.*;
import java.util.*;
public class Java_Q3 {

	public static void main(String[] args) throws IOException {
		Scanner xyz=new Scanner(System.in);
		
		int count=0;
		File f=new File("D:\\File_Handling\\write.txt");
		f.createNewFile();
		 boolean b=f.exists();
		 if(b) {
			 System.out.println("insert data into file....!");
			 String data=xyz.nextLine();
			 FileWriter fw=new FileWriter("D:\\File_Handling\\write.txt");
			 fw.write(data);
			 fw.close();
			 System.out.println("data save successful.......!");
		 }
		 else {
			 System.out.println("Some problem............");
		 }
		 
		 FileReader fr=new FileReader(f);
			BufferedReader bf=new BufferedReader(fr);    //count word logic
			String  data2=xyz.nextLine();
			while((data2=bf.readLine())!=null) {
			   String[] s=data2.split(" ");
			   count+=s.length;
			}
			System.out.println("Word Count is "+count);
			//bf.close();
			//fr.close();
			
			//String data2=xyz.nextLine();
        	while((data2=bf.readLine())!=null) {
        	   String[] s=data2.split("\n");
        	   count+=s.length;
        	}
        	System.out.println("lines Count is "+count);
        	bf.close();
        	fr.close();

	}
	
	

	
	
}





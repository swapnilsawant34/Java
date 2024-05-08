package file_handling;
import java.io.*;


public class File_Create_Application {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\demo1\\demo2.pdf");
		boolean b1=f.exists();
		if(f.exists()) {
			System.out.println("folder already exit");
		}
		else {
			boolean b=f.createNewFile();// this function for the file  // or boolean b=f.mkdir(); --->this for creating the folder
			if(b)
			{
				System.out.println("folder created.");
			}else {
				System.out.println("Some problem is there.....");
			}
		}
	}

}

package collection_practical;
import java.util.*;
class Doctor
{
	int fid;
	String name;
	String speciality;
	String city;
	int fees;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
}

public class DoctorInfoApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		ArrayList al=new ArrayList();
		int size;
		System.out.println("Enter the count of doctor");
		size=xyz.nextInt();
		
		Doctor d[]=new Doctor[size]; //array of reference
		
		for(int i=0;i<d.length;i++) {
		d[i]=new Doctor(); //array of object	
		
		System.out.println("Enter the name,speciality,city,fid and fees of Doctor");
		xyz.nextLine();
		String name=xyz.nextLine();
		String speciality=xyz.nextLine();
		String city=xyz.nextLine();
		int fid=xyz.nextInt();
		int fees=xyz.nextInt();
		
		d[i].setName(name);
		d[i].setSpeciality(speciality);
		d[i].setCity(city);
		d[i].setFid(fid);
		d[i].setFees(fees);
	     
		al.add(d[i]);
		}
		
		
			int choice;
			
			
			//System.out.println("3:Search doctor by city:");
			//System.out.println("4:Search doctor by low fees:");
			
			System.out.println("Enter the choice:");
			choice=xyz.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("1:Display all doctor details:");
				for(Object obj:al)
				{
					Doctor doc=(Doctor)obj;
					System.out.println(doc.getFid()+"\t"+doc.getName()+"\t"+doc.getSpeciality()+"\t"+doc.getCity()+"\t"+doc.getFees());
				}
			break;	
			
			case 2:
				System.out.println("2:Search By Speciality:");
				String spec;
				System.out.println("Enter the Speciality to search the doctor");
				xyz.nextLine();
				spec=xyz.nextLine();
				
				for(int k=0;k<al.size();k++)
				{
					Doctor d1=(Doctor)al.get(k);
					String spec1=(String)d1.getSpeciality();
					if(spec1.equals(spec))
					{
						System.out.println(d1.getFid()+"\t"+d1.getName()+"\t"+d1.getSpeciality()+"\t"+d1.getCity()+"\t"+d1.getFees());	
					}
					
				}
				
			break;
			case 3:
				System.out.println("3:Search doctor by city:");
				System.out.println("Enter the city:");
				xyz.nextLine();
				String city1=xyz.nextLine();
				
				/*for(int m=0;m<al.size();m++)
				{
					Doctor d2=(Doctor)al.get(m);
					String city2=(String)d2.getCity();
					if(city2.equals(city1))
					{
						System.out.println(d2.getFid()+"\t"+d2.getName()+"\t"+d2.getSpeciality()+"\t"+d2.getCity()+"\t"+d2.getFees());	
					}
				}*/
				
				for(Object obj:al)
				{
					Doctor d2=(Doctor)obj;
					if(d2.getCity().equals(city1))
					{
						System.out.println(d2.getFid()+"\t"+d2.getName()+"\t"+d2.getSpeciality()+"\t"+d2.getCity()+"\t"+d2.getFees());	
					}
					
				}
				break;
				
			case 4:
				System.out.println("4:Search doctor by low fees:");
				System.out.println("Enter the minimum fees");
				int fee=xyz.nextInt();
				
				for(Object obj:al)
				{
					Doctor d3=(Doctor)obj;
					if(d3.getFees()==fee)
					{
						System.out.println(d3.getFid()+"\t"+d3.getName()+"\t"+d3.getSpeciality()+"\t"+d3.getCity()+"\t"+d3.getFees());
					}
				}
				break;
			}	
		
		
		
	}

}

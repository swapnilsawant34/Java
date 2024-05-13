package doctor;
import java.util.*;
class Doctor
{
	String city;
	String name;
	
	int id;
	int fees;
	int rank;
	
	void getDetails(String city,String name,int id,int fees,int rank)
	{
		this.city= city;
		this.name=name;
		
		this.id= id;
		this.fees= fees;
		this.rank =rank;		
		
	}
	
	
	
	
	void DisplayDetails()
	{
		System.out.println("  "+city +name +id +fees +rank);
		
	}
	
	int getRank()
	{
		return rank;
		
	}
	
	int getFees()
	{
		return fees;
	}
	
	String getCity()
	{
		return city;
	
	}
	
	
}

public class DoctorApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		Doctor d[] = new Doctor[5]; 
		
		
		
		String city;
		String name;
		int id;
		int fees;
		int rank;
		
		for(int i=0;i<5;i++)
		{
			d[i]=new Doctor();
			
			
			System.out.println("Enter the city,name,id,fees,rank");
			
			city=xyz.nextLine();
			name=xyz.nextLine();
			id=xyz.nextInt();
			fees=xyz.nextInt();
			rank=xyz.nextInt();
            xyz.nextLine();
			d[i].getDetails(city,name,id,fees,rank);
			
			
		}
		
		for(int i=0;i<5;i++)
		{
			d[i].DisplayDetails();
			
		}
		
		int choice;
		System.out.println("Enter the choice");
		choice=xyz.nextInt();
		
		switch (choice)
		{
			case 1:
				System.out.println("Sotrt all records in decending order by rank");
				for(int i=0;i<5;i++)
				{
					for(int j=i+1;j<5;j++)
					{
						int p_rank=d[i].getRank();
						int n_rank=d[j].getRank();
						
						if(p_rank<n_rank)
						{
							Doctor temp=d[i];
							d[i]=d[j];
							d[j]=temp;
							
						}
					}
				}
						
						System.out.println("Sotrt all records in decending order by rank");
						for(int i=0;i<5;i++)
						{
							d[i].DisplayDetails();
							
						}
				break;
			case 2:
				
				for(int i=0;i<5;i++)
				{
					for(int j=i+1;j<5;j++)
					{
						int p_fees=d[i].getFees();
						int n_fees=d[j].getFees();
						
						if(p_fees<n_fees)
						{
							Doctor temp=d[i];
							d[i]=d[j];
							d[j]=temp;
							
						}
					}
					
					
				    }
				System.out.println("Display all records of Doctor who has max fees");
				for(int i=0;i<5;i++)
				{
					d[i].DisplayDetails();
					
				}
			break;
			
			case 3:
				String s_city;
				System.out.println("Enter the city for to serch the doctor");
				xyz.nextLine();
				s_city=xyz.nextLine();
				
				
				
				for(int i=0;i<5;i++)
				{
					
					 String city1=d[i].getCity();
					//if(city==s_city)
						if(city1.equals(s_city))	
					{
						d[i].DisplayDetails();
						
					}
					
				}
				
						
						
						
						
					
					
				
				
			
		}
			

	}

}

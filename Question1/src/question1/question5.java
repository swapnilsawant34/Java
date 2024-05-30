package question1;


import java.util.*;

class Employee
{
	 String name;
	  int id;
	  int sal;
	  
	  void acceptDetails( String name,int id,int sal)
	  {
		  this.name=name;
		  this.id=id;
		  this.sal=sal;
	  }
	  
	  void showDetails()
	  {
		  System.out.println("\t"+name+"\t"+id+"\t"+sal+"\t");
	  }
	  
	 int getId()
	  {
		  return id;
	  }
	
	
}


public class question5 {
	
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		  Employee e[]=new Employee[5];
		  
		  
		  for(int i=0;i<e.length;i++)
		  {
			  e[i]=new Employee();
			  
			  System.out.println("Enter the Emplyoee name,id and salary");
			  
			  String  name=xyz.nextLine();
			
			  int id=xyz.nextInt();
			
			  int sal=xyz.nextInt();
			  
			  e[i].acceptDetails(name, id, sal);
			  xyz.nextLine();
			  
		}
		  
		  for(int i=0;i<e.length;i++)
		  {
			  e[i].showDetails();
			  
		  }
		  
		  
		  for(int i=0;i<e.length;i++)
		  {
			  for(int j=i+1;j<e.length;j++)
				{
			  int p_id=e[i].getId();
			  int n_id=e[j].getId();
			  
			  
			   if(p_id>n_id) 
			   {
				   Employee temp=e[i];
				   e[i]=e[j];
				   e[j]=temp;
				   
				   
			   }
			    
			}
			 // p[i].showDetails();
		  }
		  
		  System.out.println("Dislplay employee record as per id in ascending order");
		  for(int i=0;i<e.length;i++)
		  {
			  e[i].showDetails();
			  
		  }
		  
		  

}
}


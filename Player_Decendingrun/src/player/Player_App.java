package player;

import java.util.*;

class Player
{
	 String name;
	  int id;
	  int run;
	  
	  void acceptDetails( String name,int id,int run)
	  {
		  this.name=name;
		  this.id=id;
		  this.run=run;
	  }
	  
	  void showDetails()
	  {
		  System.out.println(""+name +id + run);
	  }
	  
	 int getRuns()
	  {
		  return run;
	  }
	
	
}


public class Player_App {
	
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		  Player p[]=new Player[5];
		  
		  
		  for(int i=0;i<p.length;i++)
		  {
			  p[i]=new Player();
			  
			  System.out.println("Enter the player name,id and runs");
			  
			  String  name=xyz.nextLine();
			
			  int id=xyz.nextInt();
			
			  int run=xyz.nextInt();
			  
			  p[i].acceptDetails(name, id, run);
			  xyz.nextLine();
			  
		}
		  
		  for(int i=0;i<p.length;i++)
		  {
			  p[i].showDetails();
			  
		  }
		  
		  
		  for(int i=0;i<p.length;i++)
		  {
			  for(int j=i+1;j<p.length;j++)
				{
			  int p_run=p[i].getRuns();
			  int n_run=p[j].getRuns();
			  
			  
			   if(p_run<n_run) 
			   {
				   Player temp=p[i];
				   p[i]=p[j];
				   p[j]=temp;
				   
				   
			   }
			    
			}
			 // p[i].showDetails();
		  }
		  
		  System.out.println("Dislplay player record as per run in decending order");
		  for(int i=0;i<p.length;i++)
		  {
			  p[i].showDetails();
			  
		  }
		  
		  

}
}

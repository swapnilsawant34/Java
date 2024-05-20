package vehicle_inheritance;
import java.util.*;
class Vehicle
{
	
	String v_model;  //vehicle model

	int r_number; //registration number
	int v_speed;  //vehicle speed
	int f_capicty; //fuel capacity
	int f_consume; // fuel consumption
	int time;
	int distance;
	int f_need;
	
	Vehicle(String v_model,int r_number, int v_speed,int f_capicty,int f_consume,int time)
	{
		this.v_model=v_model;
		this.r_number=r_number;
		this.v_speed=v_speed;
		this.f_capicty=f_capicty;
		this.f_consume=f_consume;
		this.time=time;
		
		
	}
	
	void distanceCovered(int time) //time as argument
	{
		distance=v_speed*time;
		
	}
	void fuelNeeded()  //distance as argument
	{
	    f_need=distance/f_consume;
		
		//System.out.println("\t"+v_model+"\t"+r_number+"\t"+f_capicty+"\t"+f_consume+"\t"+f_need+"\t");
	}
	
	void display()
	{
		System.out.println("\t"+v_model+"\t"+r_number+"\t"+f_capicty+"\t"+f_consume+"\t"+f_need+"\t");
		
	}
	
};

class Truck extends Vehicle
{
	Truck(String v_model,int r_number, int v_speed,int f_capicty,int f_consume)
	{
		super(v_model,r_number,v_speed,f_capicty,f_consume);
		}
	
	void display()
	{
		System.out.println("\t"+v_model+"\t"+r_number+"\t"+f_capicty+"\t"+f_consume+"\t"+f_need+"\t");
		
	}
	
		
	
	
	
}
class Bus extends Vehicle
{
	Bus(String v_model,int r_number, int v_speed,int f_capicty,int f_consume)
	{
		super(v_model,r_number,v_speed,f_capicty,f_consume);
	
	
   }
	void display()
	{
		System.out.println("\t"+v_model+"\t"+r_number+"\t"+f_capicty+"\t"+f_consume+"\t"+f_need+"\t");
		
	}
	

}





public class Vehicle_Inheritance {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	String v_model;  //vehicle model
	int r_number; //registration number
	int v_speed;  //vehicle speed
	int f_capicty; //fuel capacity
	int f_consume; // fuel consumption 
	int time;
	System.out.println("Enter the vehicle model,reg number,vehicle speed,fuel capacity,fuel consume,and time require");
	
	v_model=xyz.nextLine();
	r_number=xyz.nextInt();
	v_speed=xyz.nextInt();
	f_capicty=xyz.nextInt();
	f_consume=xyz.nextInt();
	time=xyz.nextInt();
	
	//Vehicle v= new Vehicle(v_model,r_number,v_speed,f_capicty,f_consume,time);
	//v.distanceCovered(time);
	//v.fuelNeeded();
	//v.display();
	Truck t=new Truck(v_model,r_number,v_speed,f_capicty,f_consume,time)
	t.display();
	
	
	Bus b=new Bus(v_model,r_number,v_speed,f_capicty,f_consume,time);
	b.display();
	
	
	
	
	

	}

}

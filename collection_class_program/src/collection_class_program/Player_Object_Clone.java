package collection_class_program;
import java.util.*;
class Play implements Cloneable{
	int id;
	String name;
	int run;
	
	void setPlayerData(int id, String name, int run) {
		this.id=id;
		this.name=name;
		this.run=run;
	}
	void showData() {
		System.out.println(id+" "+name+" "+run);
	}
	
	Play getData() throws CloneNotSupportedException{  //step 3
		Object obj=this.clone();
		Play p=(Play)obj;
		return p;
		
		//return (Player)this.clone();
		}
	public String toString() {  //overriding toString method.
		return"["+name+","+id+","+run+"]";
	
	}
}

public class Player_Object_Clone {

	public static void main(String[] args)  throws CloneNotSupportedException {
		Play p1=new Play();
		p1.setPlayerData(1,"aaa",2000);
		
		Play p2=p1.getData();
		p2.setPlayerData(2, "qqqq", 6000);
		p1.showData();
		
		System.out.println(p1); //p.toString
       
	}

}

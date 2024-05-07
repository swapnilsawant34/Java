package collection_class_program;
import java.util.*;
class Player1
{
	private int id;
	private String name;
	private int run;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	/*Player1(String name,int id,int run){
		this.name=name;
		this.id=id;
		this.run=run;
	} 
	 */
}

class SortPlayerById implements Comparator{
	public int compare(Object o1,Object o2)
	{
		Player1 p1=(Player1)o1;
		Player1 p2=(Player1)o2;
		if(p1.getId()>p2.getId()) {
			return 1;
		}else if(p1.getId()<p2.getId()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}

class SortPlayerByRun implements Comparator{
	public int compare(Object o1,Object o2)
	{
		Player1 p1=(Player1)o1;
		Player1 p2=(Player1)o2;
		if(p1.getRun()>p2.getRun()) {
			return 1;
		}else if(p1.getRun()<p2.getRun()) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class Comparator_interface_Sorting {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		/*al.add(new Player1("ABC",3,1000));
		al.add(new Player1("MNO",4,5000));
		al.add(new Player1("PQR",2,3000));
		al.add(new Player1("STV",5,9000));
		al.add(new Player1("XYZ",1,2000));*/
		
		Scanner xyz=new Scanner(System.in);
		int size;
		System.out.println("Enter the player count");
		size=xyz.nextInt();
		Player1 p[]=new Player1[size];  //array of reference.
		
		for(int i=0;i<p.length;i++)
		{
			xyz.nextLine();
			p[i]=new Player1();
			System.out.println("Enter the name,id,runs  of the player");
			String name=xyz.nextLine();
			int id=xyz.nextInt();
			int run=xyz.nextInt();
			
			
			p[i].setName(name);
			p[i].setId(id);
			p[i].setRun(run);
		
			al.add(p[i]);

		}
		System.out.println("1:Sort Player Id");
		System.out.println("2:Sort Player Run");
		System.out.println("Enter the choice:");
		int choice=xyz.nextInt();
		System.out.println("display player record before sorting");
		for(Object obj:al) {
			Player1 p1=(Player1)obj;
			System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
		}
		switch(choice) {
		case 1:
			SortPlayerById sid=new SortPlayerById();
			Collections.sort(al,sid);
			/*
			 * Use Collections.sort() :in given fashion
               Syntax: Collections.sort(List,Comparator): this method contain two parameters 
               List: this parameter contain all user defined objects
               Comparator: we can pass here implementer class object of Comparator or Comparator
			 * 
			 */
			System.out.println("display player record after sorting");
			for(Object obj:al) {
				Player1 p1=(Player1)obj;
				System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
			}
			break;
		case 2:
			SortPlayerByRun srun=new SortPlayerByRun();
			Collections.sort(al,srun);
			System.out.println("display player record after sorting");
			for(Object obj:al) {
				Player1 p1=(Player1)obj;
				System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
			}
			break;
			default:
				System.out.println("Wrong choice");
		}

	}

}

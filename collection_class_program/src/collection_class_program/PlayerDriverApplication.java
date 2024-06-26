/*create program to create class name as Player with field id, name and run as well as age and 
 * we want to remove player from team whose age is greater than 35.
 */
package collection_class_program;
import java.util.*;
class Player{
	
	private int id;
	private String name;
	private int run;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class PlayerDriverApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		int size;
		System.out.println("Enter the player count");
		size=xyz.nextInt();
		Player p[]=new Player[size];  //array of reference.
		
		for(int i=0;i<p.length;i++)
		{
			xyz.nextLine();
			p[i]=new Player();  //array of object
			System.out.println("Enter the name,id,runs and age of the player");
			String name=xyz.nextLine();
			int id=xyz.nextInt();
			int run=xyz.nextInt();
			int age=xyz.nextInt();
			
			p[i].setName(name);
			p[i].setId(id);
			p[i].setRun(run);
			p[i].setAge(age);
			v.add(p[i]);

		}
		System.out.println("Player list before deletion");
		for(Object obj:v) {
			Player plr=(Player)obj;
			System.out.println(plr.getId()+"\t"+plr.getName()+"\t"+plr.getRun()+"\t"+plr.getAge());
		}
		
		//player deletion logic
		
		Iterator i=v.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			
			Player plr=(Player)obj;
			
			if(plr.getAge()>=35)
			{
				i.remove();
			}
			
		}
		System.out.println("Player list after deletion");
		
		for(Object obj:v) {
			Player plr=(Player)obj;
			System.out.println(plr.getId()+"\t"+plr.getName()+"\t"+plr.getRun()+"\t"+plr.getAge());
		}

	}

}

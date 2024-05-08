package collection_practical;
import java.util.*;
public class HashSetApplication {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		HashSet hs=new HashSet();
		HashSet hs1=new HashSet();
		
		
		
		do {
			System.out.println("Enter the choice");
			int choice=xyz.nextInt();
			
		switch(choice)
		{
		case 1:
			hs.add(10);
			hs.add(20);
			hs.add(30);
			hs.add(40);
			hs.add(50);
		break;
		
		case 2:
			System.out.println("Elements in hashset");
             Iterator i=hs.iterator();
			while(i.hasNext())
			{
				Object obj=i.next();
				
				System.out.println(obj);
			}
		  	
		
			break;
		
		case 3:
			System.out.println("Enter the search the element");
			int sval=xyz.nextInt();
			boolean b=hs.contains(sval);
			if(!b)
			{
				System.out.println("Element found!!");
			}
			else
			{
				System.out.println("Element not found!!");
			}
			break;
			
		case 4:
			System.out.println("Enter the elements to remove");
			int rval=xyz.nextInt();
			
			 Iterator i1=hs.iterator();
				while(i1.hasNext())
				{
					Object obj1=i1.next();
					
					if((int)obj1==rval)
					{
						i1.remove();
					}
				}
				
				 Iterator i2=hs.iterator();
					while(i2.hasNext())
					{
						Object obj=i2.next();
						
						System.out.println(obj);
						
					}
			break;
                   
		case 5:
			int count=0;
			Iterator i3=hs.iterator();
			
			while(i3.hasNext())
			{
				Object obj=i3.next();
				count++;
			}
			System.out.println("Count of elements is:"+count);
			break;
			
			
		case 6:
			
			hs1.add(60);
			hs1.add(70);
			hs1.add(80);
			hs.addAll(hs1);
			
			System.out.println(hs);
			break;
		
		case 7:
			hs.removeAll(hs1);
			
	         Iterator i5=hs.iterator();
			
			while(i5.hasNext())
			{
				Object obj=i5.next();
				System.out.println(obj);
			}
			break;
			
		case 8:
			hs.clear();
			System.out.println(""+hs);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		   
		
		}

}while(true);
}
}


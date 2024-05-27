package practice;
import java.util.*;
public class Basic_Code {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     int a[]= {12,16,30,20,12}; //12 16 20 30      
     
     int first=0;
     int second=0;
     
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]>first)
    	 {
    		 second=first;
    		 first=a[i];
    	 }else if(a[i]<first && a[i]>second ) {
    		 second=a[i];
    		 
    	 }
     }
     System.out.println("Second highest:"+second);
  }

}


/*
 * 
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Count");
      int count=sc.nextInt();
      int n1=0,n2=1,n3;
      System.out.println(n1+"\n"+n2);
      
      for(int i=2;i<count;i++)
      {
    	  n3=n1+n2;
    	  System.out.println(""+n3);
    	  n1=n2;
    	  n2=n3;
      }     
    
  }

}
 * 
 */

/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the  array size");
      int size=xyz.nextInt();
      
      int a[]=new int[size];
      System.out.println("Enter the array element:");
      for(int i=0;i<a.length;i++)
      {
    	  a[i]=xyz.nextInt();
      }
      System.out.println("Negative numbers in the array is:");
      for(int i=0;i<a.length;i++)
      {
    	  if(a[i]<0)
    	  {
    		  System.out.println(a[i]);
    	  }
      }
   
     
    
  }

}
 * 
 * 
 */

/*
 * 
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=xyz.nextInt();
   
     
     int rev=0,temp;
     temp=n;
     
      while(n>0)
      {
    	 int rem=n%10;
    	  rev=(rev*10)+rem;
    	  n=n/10;  
      }
     if(temp==rev)
     {
    	 System.out.println("Number is palindrome");
     }
     else
     {
    	 System.out.println("Number is palindrome");
     }
    
  }

}
 * 
 */


/*
 * 
 * public class Number{
    public static void  main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int temp=no;
        int sum=0;
        for(int i=1;i<no;i++)
        {
            if(no%i==0)
                {
                    sum=sum+i;
                    
                }
        }
        if(sum==temp)
        {
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not");
        }
    }
}
 */

/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=xyz.nextInt();
     int rev=0;
     
      while(n>0)
      {
    	 int rem=n%10;
    	  rev=(rev*10)+rem;
    	  n=n/10;
    	  
    	  
      }
     System.out.println(rev);  //reverse number logic
    
    
  }

}
 * 
 * 
 * 
 */

/*
 * 
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the range");
      int range=xyz.nextInt();  
     
      
     for(int i=1;i<=range;i++)
     {
    	 int count=0;
    	 for(int j=1;j<=i;j++)
    	 {
    		 if(i%j==0)
    		 {
    			 count++;
    			 
    		 }
    	 }
    	 if(count==2)
         {
        	 System.out.println(i); //print 1 to n prime numbers..
         }
     }
    
    
  }

}
 * 
 */


/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=xyz.nextInt();
      boolean flag=false;
     for(int i=2;i<n;i++)
     {
    	if(n%i==0)
    	{
    		flag=true;
    		break;
    	}
    	
     }
     if(flag==false)
     {
    	 System.out.println("Number is prime");
     }
     else {
    	 System.out.println("Number is not prime");
     }
  }

}
 * 
 */


/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=xyz.nextInt();
      
     for(int i=1;i<=10;i++)
     {
    	// n=n*i;
    	 System.out.println(n*i); 	
     }
  }

}
 * 
 * 
 */

/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the range");
      int n=xyz.nextInt();
      
      int sum=0;
     for(int i=1;i<=n;i++)
     {
    	 if(i%2==0)
    	 {
    	sum=sum+i;
    	 }
     }
 	System.out.println(sum); //sum of 1 to even numbers
	}

}
 * 
 * 
 * 
 * 
 */

/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the range");
      int n=xyz.nextInt();
      
      int sum=0;
     for(int i=1;i<=n;i++)
     {
    	sum=sum+i; 
    	
     }
 	System.out.println(sum); //print even numbers
	}

}
 * 
 * 
 * 
 */

/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the range");
      int n=xyz.nextInt();
      
      
     for(int i=1;i<=n;i++)
     {
    	 if(i%2==1)
    	 {
    		 System.out.println(i);
    	 }
     }
     
	}

}
 * 
 * 
 * 
 * 
 */

/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the range");
      int n=xyz.nextInt();
      
      
     for(int i=2;i<=n;i++)
     {
    	 if(i%2==0)
    	 {
    		 System.out.println(i);
    	 }
     }
     
	}

}
 * 
 * 
 */

/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the range");
      int n=xyz.nextInt();
      
      
      while(n>0)
      {
    	  System.out.println(n);  //print n to 1 reverse.
    	  n--;
      }
     
	}

}
 * 
 * 
 * 
 */


/*
 * public class Basic_Code {

	public static void main(String[] args) {
      Scanner xyz=new Scanner(System.in);
      System.out.println("Enter the range");
      int n=xyz.nextInt();
      
      
      for(int i=1;i<=n;i++)
      {
    	  System.out.println(i);  //print 1 to n numbers.
    	  
      }
     
	}

}
 * 
 * 
 */

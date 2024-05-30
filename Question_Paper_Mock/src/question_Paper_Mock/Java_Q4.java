package question_Paper_Mock;


import java.util.*;

class FindMax{
	int max;
	void setValue(int a[]) {
		
		max=a[0];  //initially max at 0th position
		for(int i=0;i<a.length;i++) {  //max logic wit iteration
			if(max<a[i]) {              
				max=a[i];
			}
		}
		
	}
	int getMax() {
		
		return max;  //return max value.
		
	}
	
}


public class Java_Q4 {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=xyz.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array values");
		for(int i=0;i<a.length;i++) {
			a[i]=xyz.nextInt();
		}
		FindMax m=new FindMax();      //calling FindMaxx method
		m.setValue(a);              //passing array using 
		
		System.out.println("Maximum value in Array: "+m.getMax());

	}

}

package collection_class_program;
import java.util.*;
public class SetOperation {

	public static void main(String[] args) {
		HashSet a=new HashSet();
		a.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,9,0}));
		
		HashSet b=new HashSet();
		b.addAll(Arrays.asList(new Integer[] {1,3,7,5,4,0,7,5}));
		
		Set union=new HashSet(a);
		union.addAll(b);
		
		System.out.println(union);
		
		Set intersection=new HashSet(a);
		intersection.retainAll(b);
		System.out.println(intersection);
		
		Set difference=new HashSet(a);
		difference.removeAll(b);
		System.out.println(difference);

	}

}
/*
Intersection:common elements in given two sets.
set1=[1,3,2,4,8,9,0]
set2=[1,3,7,5,4,0,7,5]
o/p={1,3,0,4}

Union:this operation. add elements in one set with other.
set1=[1,3,2,4,8,9,0]
set2=[1,3,7,5,4,0,7,5]
o/p={0,1,2,3,4,5,7,8,9}

Difference: set1-set2
{2,8,9}
*/

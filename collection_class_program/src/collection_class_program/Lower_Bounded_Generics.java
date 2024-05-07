package collection_class_program;
import java.util.*;

abstract class Value{
	int a,b;
	abstract void setValue(int x,int y);
	abstract int getResult();
}
class Add extends Value{
	void setValue(int x,int y) {
		this.a=x;
		this.b=y;
	}
	int getResult() {
		return a+b;
	}
}
class Mul extends Value{
	void setValue(int x,int y) {
		this.a=x;
		this.b=y;
	}
	int getResult() {
		return a*b;
	}
}
public class Lower_Bounded_Generics {

	public static void main(String[] args) {
		ArrayList<? super Value> al=new ArrayList();  //? super parentname
		Mul m=new Mul();
		m.setValue(10, 20);
		al.add(m);
		System.out.println(m.getResult());
		
		Add ad=new Add();
		ad.setValue(20, 60);
		al.add(ad);
		System.out.println(ad.getResult());

	}

}
/*
If we think about above ArrayList object al so this al object only accept parameter those are child class of 
Value means we can store Mul and Add class object in ArrayList.
*/
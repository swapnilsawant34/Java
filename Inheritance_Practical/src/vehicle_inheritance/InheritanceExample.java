package vehicle_inheritance;


class Value{
	int a,b;
	
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
}

class Add extends Value{
	int getAdd()
	{
		return a+b;
	}
	
}
class Mul extends Value{
	int getMul()
	{
		return a*b;
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		Add ad=new Add();
		ad.setValue(10, 20);
		System.out.println("Addition is:"+ad.getAdd());
		
		Mul ml=new Mul();
		ml.setValue(10, 20);
		System.out.println("Multiplication is:"+ml.getMul());

	}

}

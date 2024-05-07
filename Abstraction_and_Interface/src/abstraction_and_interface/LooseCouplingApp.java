package abstraction_and_interface;  //loose coupling code.
import java.util.*;

abstract class Value
{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract void performCalculation();
}

class Add extends Value
{
	void performCalculation()
	{
		int c=a+b;
		System.out.println("Addition is:"+c);
		
	}
}

class Mul extends Value
{
	void performCalculation()
	{
		int c=a*b;
		System.out.println("Multiplication is:"+c);
	}
}

class Div extends Value
{
	void performCalculation()
	{
		int c=a/b;
		System.out.println("division is:"+c);
	}
}

class Sub extends Value
{
	void performCalculation()
	{
		int c=a-b;
		System.out.println("Subtraction is:"+c);
	}
}

class Calculator
{
	
		void performCalculation(Value v)  //here Value v consist of all three classes references.
		{
			v.performCalculation();
		}
	
}

public class LooseCouplingApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		
		System.out.println("Enter the two numbers");
		int x=xyz.nextInt();
		int y=xyz.nextInt();
		
		Calculator c=new Calculator();
		
		System.out.println("Enter the choice");
		int choice=xyz.nextInt();
		
		switch(choice)
		{
		
		case 1:
			Add a=new Add();
			a.setValue(x, y);
			c.performCalculation(a);
		break;
		
		case 2:
			Mul m=new Mul();
			m.setValue(x, y);
			c.performCalculation(m);
		break;
		
		case 3:
			Div d=new Div();
			d.setValue(x, y);
			c.performCalculation(d);
		break;
		
		case 4:
			Sub s=new Sub();
			s.setValue(x, y);
			c.performCalculation(s);
		break;
		
		default:{
			System.out.println("Invalid choice");
		}
		}

	}

}

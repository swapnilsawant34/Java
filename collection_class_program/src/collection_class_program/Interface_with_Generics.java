package collection_class_program;
interface Area<E>{
	void setRadius(E e);
}

class Circle implements Area<Integer>{
	public void setRadius(Integer e) {
		System.out.println("Integer Radius is"+e);
	}
}
class Cirm implements Area<Float>{
	public void setRadius(Float e) {
		System.out.println("Float Radius is"+e);
	}
}
public class Interface_with_Generics {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.setRadius(5);
		
		Cirm cm=new Cirm();
		cm.setRadius(5.4f);
		
		
		

	}

}

package abstraction_and_interface;

abstract class Animal
{
	abstract void makeSound();
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog sounds Bark");
	}
	
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat sounds mau");
	}
	
}

public class AnimalApp {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.makeSound();
		
		Cat c=new Cat();
		c.makeSound();

	}

}

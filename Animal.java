
public class Animal 
{
	public Animal() 
	{
		System.out.println("animal cons");
	}
	public void eat()
	{
		System.out.println("eats food");
	}
}
class Men extends Animal
{
	public Men() 
	{
		System.out.println("men cons");
	}
	public void eat()
	{
		super.eat();
		System.out.println("eats chicken");
		
	}
}
class Dog extends Men
{
	public Dog() 
	{
		System.out.println("dog cons");
	}
	public void eat()
	{
		super.eat();
		System.out.println("eats pedigree");
		
	}
}

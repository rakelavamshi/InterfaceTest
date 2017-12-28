
//Interface example has to implement all the methods  where as abstract need not
public class DemoAnimal 
{
	public static void main(String [] args)
	{
		Dog d=new Dog();
		d.eating();
		d.sleeping();
		d.makeNoise();
		
		Cat c=new Cat();
		c.eating();
		c.sleeping();
		c.makeNoise();
	}
}

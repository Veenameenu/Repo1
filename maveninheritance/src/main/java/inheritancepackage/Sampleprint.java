package inheritancepackage;

public class Sampleprint extends Animal{
	public void eat()
	{
	System.out.println("Eating");
	}
	public static void main(String args[])
	{
	Sampleprint a=new Sampleprint();
	a.eat();
	a.run();
}
}

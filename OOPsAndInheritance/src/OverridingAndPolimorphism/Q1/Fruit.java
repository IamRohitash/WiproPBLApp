package OverridingAndPolimorphism.Q1;

public class Fruit {
	private String name;
	private String taste;
	private int size;
	Fruit(String name,String taste)
	{
		this.name=name;
		this.taste=taste;
	}
	
	void eat()
	{
		System.out.println("The name of fruit is:"+name);
		System.out.println("The taste of fruit is:"+taste);
	}

}

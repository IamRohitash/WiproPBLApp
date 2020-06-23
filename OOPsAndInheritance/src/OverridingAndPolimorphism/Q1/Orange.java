package OverridingAndPolimorphism.Q1;

public class Orange extends Fruit {
	private String taste;

	Orange(String name, String taste) {
		super(name,taste);
		this.taste=taste;
		
		// TODO Auto-generated constructor stub
	}
	public void eat() {
		System.out.println("The taste of Orange is:"+taste);
	}

}

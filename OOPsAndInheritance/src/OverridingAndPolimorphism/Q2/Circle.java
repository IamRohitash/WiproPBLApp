package OverridingAndPolimorphism.Q2;

public class Circle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Erasing circle");
	}
	

}

package OverridingAndPolimorphism.Q2;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle();
		Shape t=new Trangle();
		Shape s=new Square();
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
		

	}

}

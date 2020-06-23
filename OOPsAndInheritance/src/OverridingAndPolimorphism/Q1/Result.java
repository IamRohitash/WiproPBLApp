package OverridingAndPolimorphism.Q1;

public class Result {
 
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Fruit obj=new Fruit("Orange","Sweet");
		obj.eat();
		obj=new Orange("Orange","bitter");
		obj.eat();
	    obj=new Apple("Apple","Sweet");
		obj.eat();
	}

}

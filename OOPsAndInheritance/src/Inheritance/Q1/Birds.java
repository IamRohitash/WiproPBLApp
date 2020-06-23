package Inheritance.Q1;

public class Birds extends Animal {
	void eat() {
		System.out.println("Birds are eating");
	}

	void sleep() {
		System.out.println("Birds are sleeping");
	}
	
	void fly() {
		System.out.println("Birds are flying");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal o1 = new Animal();
		Birds o2 = new Birds();
		o1.eat();
		o1.sleep();
		o2.eat();
		o2.sleep();
		o2.fly();

}

}

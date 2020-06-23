package Inheritance.Q2;

public class Employee extends Person {
	
	double salary;
	int year;
	String InsuranceNumber;
	Employee(String name,double salary,int year,String InsuranceNumber){
		super(name);
		this.salary=salary;
		this.year=year;
		this.InsuranceNumber=InsuranceNumber;
		
	}
	void display()
	{
		System.out.println("Employee's Name:"+name);
		System.out.println("Employee's salary:"+salary);
		System.out.println("Employee's joining year:"+year);
		System.out.println("Employee's Insurance number:"+InsuranceNumber);
	}
	
	

}

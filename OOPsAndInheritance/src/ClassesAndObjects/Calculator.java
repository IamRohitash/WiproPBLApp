package ClassesAndObjects;

public class Calculator {
	
		public static double powerInt(int n1,int n2) {
			return Math.pow(n1, n2);
		}
		public static double powerDouble(double n1,double n2) {
			return Math.pow(n1, n2);
		}
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("The result of powerInt is:"+powerInt(4, 5));
			System.out.println("The result of powerDouble is:"+powerDouble(2.5, 5));

		}


}

package StringAndStringBuffer;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=args[0];
		StringBuffer stb=new StringBuffer(str);
		stb=stb.reverse();
		String str1=stb.toString();
		if(str.equals(str1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		

	}

}

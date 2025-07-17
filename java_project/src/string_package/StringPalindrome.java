package string_package;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a="Java";
		String a=new String("Malayalam");
		System.out.println("Given String is: "+a);
		
		String rev="";
		
		for(int i=(a.length()-1);i>=0;--i) {
			rev=rev+a.charAt(i);
		}
		
		System.out.println("Reversed String is: "+rev);
		
		if(a.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println(a+" is a Palindrome String.");
		}
		else {
			System.out.println(a+" is not a Palindrome String.");
		}
	}
}

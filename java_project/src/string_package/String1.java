package string_package;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Java";
		String b="Java";
		String c=new String("Java");
		String d=new String("Java");
		
		System.out.println(a==b);
		System.out.println(c==d);
		
		System.out.println(b==c);
		
		System.out.println(a.equals(b));
		
		System.out.println(c.equals(d));
		
		System.out.println(b.equals(c));
		
	}

}

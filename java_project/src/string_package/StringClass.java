package string_package;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java Program";
		System.out.println(s1.length());//length()
		
		System.out.println(s1.charAt(5));//charAt()
		
		int a=2025;
		String a1=String.valueOf(a);//valueOf()
		System.out.println(a1);
		
		System.out.println(s1.equals("java program"));//equals()
		
		System.out.println(s1.equalsIgnoreCase("java program"));//equalsIgnoreCase()
		
		System.out.println(s1.isEmpty());//isEmpty()
		
		String name="Saritha";
		String name1="Aswin";
		System.out.println(name.concat(name1));//concat()
		
		System.out.println(s1.toUpperCase());//toUpperCase()
		
		System.out.println(s1.toLowerCase());//toLowerCase()
		
		System.out.println(s1.contains("name"));//contains()
	}

}

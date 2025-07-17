package string_package;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("Java");//StringBuffer
		
		//append()-add to last
		a.append(" Programming");
		System.out.println(a);
		
		//insert()-add after the index even if in between the words
		a.insert(16," Language");
		System.out.println(a);
		
		//replace()-to replace programming to hai by giving starting and ending index of programming
		a.replace(5, 16, "Hai");
		System.out.println(a);
		
		//delete()-to delete hai by giving starting and ending index also adding space index if needed to delete
		a.delete(5,9);
		System.out.println(a);
		
		//capacity()
		StringBuffer a1=new StringBuffer("");
		System.out.println(a1.capacity());//default value of capacity
		System.out.println(a.length());
		System.out.println(a.capacity());
		
		//substring()
		System.out.println(a.substring(5));
		System.out.println(a.substring(1,4));
		
		//reverse()
		System.out.println(a.reverse());
		
	}

}

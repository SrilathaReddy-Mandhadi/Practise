
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Selenium";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
			 rev= rev + s.charAt(i);
			 
		}
			System.out.println(rev);
			
			System.out.println("second method");
		// becos string buffer is mutable, we can use revrse function where as string is immutable we cant directly reverse
			StringBuffer sf=new StringBuffer(s);
			System.out.println(sf.reverse());
			
			
			
	}

}

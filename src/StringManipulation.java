
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "the rains have started here";
				String str2 = "the rains have started here";
		
		
		System.out.println(str.length());// length is used for String 
		System.out.println(str.charAt(5));//element at 5th index
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1));//2d occurence of s
		System.out.println(str.indexOf("have"));
		System.out.println(str.indexOf("halo"));
		
		System.out.println(str.equals(str2));
		System.out.println("both strings are equal");
			
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println("both strings are equals ignore case");
		
		System.out.println(str.substring(12,18)+"hi");
		
		String s =" hello World  ";
				System.out.println(s.trim());
		System.out.println(s.replace(" ",""));
		
		String date="01-01-2022";
				System.out.println(date.replace("-", "/"));
				
				//Split functionality
				
		/*	String s1 = "hello_world_test_selenium";	
			String a[]= s1.split("_");
			for(int i=0;i<s1.length();i++)
			{
				System.out.println(a[i]);
			}
					*/		
			String s2="hello";
				System.out.println(s2.concat("worldff"));
				
				String x="hello";
				String y="world";
				int a=100;
				int b=200;
				System.out.println(x+y);
				System.out.println(a+b);
				System.out.println(x+y+a+b);
				System.out.println(a+b+x+y);
				System.out.println(x+y+(a+b));
			
		}

}

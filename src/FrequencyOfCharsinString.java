
public class FrequencyOfCharsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="this is a cat";
		for(char ch='a';ch<='z';ch++)
		{
			int c=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				c++;
			}
			if(c!=0)
			{
				System.out.println(ch +" repeated" + c+ "times");
			}
			
		}
	}

}

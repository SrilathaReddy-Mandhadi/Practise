import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {
	
	public static void main(String []args)
	{
		String names[]={"Java","c","java","C#","javascript","java","c"};
				for(int i=0;i<names.length;i++)
				{ 
				for(int j=i+1;j<names.length-1;j++)
					{
						if(names[i].equals(names[j]))
							{
				System.out.println("dupicate ele is "+names[i]);
				}
				}
				}
				System.out.println("***********");
				
				//Using Set, Set will not add any duplicate values..
				Set<String> store= new HashSet<String>();
				for(String name:names)
				{
				if(store.add(name)==false)
					{	
						System.out.println("duplicate ele is" +name);
					}
				}

				System.out.println("***********");
				
				Map<String, Integer> storeMap = new HashMap<String, Integer>();
				for(String name:names)
				{
				Integer count = storeMap.get(name);
				if(count==null)
				{
					storeMap.put(name,1);
				}
				else
					if(count!=null)
					{
					storeMap.put(name,++count);
					}
				}
				
			/*	Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
				for(Entry<String, Integer> entry : entrySet) {
					if(entry.getValue()>1)
					{
					System.out.println("dup ele is" +entry.getKey());
					}
				}*/
	}

}

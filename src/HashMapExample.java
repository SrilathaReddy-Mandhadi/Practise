import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		
	Map<String,Integer> marks= new HashMap<String, Integer>();
	marks.put("Sri", 100);
	marks.put("Latha", 200);
	
	marks.put(null,500);
	
	System.out.println(marks.get("Latha"));
		
		}

}


import java.util.Arrays;

public class smallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int numbers[] = {-10,24,50,-58,-5,-90,0};
	int largest = numbers[0];
	int smallest = numbers[0];

	for(int i=1;i<numbers.length;i++)
	{
	if(numbers[i]>largest)
	{ 
		largest =numbers[i];
	}
	
	else
	if(numbers[i]<smallest)
	{
	smallest=numbers[i];
	}
	}
	System.out.println("numbers string is"+Arrays.toString(numbers));
	System.out.println("largest is"+largest);
	System.out.println("smalles is"+smallest);
	
	
	}
}
	

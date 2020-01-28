package list;
import java.util.ArrayList;
public class Clear
{
	public static void main(String[] args)
	{
		 ArrayList<String> array = new ArrayList<>(); 
         
	        array.add("A");
	        array.add("B");
	        array.add("C");
	        array.add("D");
	         
	        System.out.println(array);   
	         
	        array.clear();
	         
	        System.out.println(array);   
	}
}

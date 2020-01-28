package list;
import java.util.ArrayList;
public class Get 
{
	public static void main(String[] args) 
	{
		  ArrayList<String> a = new ArrayList<String>();

		  a.add("A");
		  a.add("B");
		  a.add("C");
		  a.add("D");
		  
		  
	         
	        String first = a.get(0);         
	        String second = a.get(3);        
	         
	        System.out.println(first);
	        System.out.println(second);
	}

}

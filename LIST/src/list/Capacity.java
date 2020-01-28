package list;
import java.util.ArrayList;
public class Capacity 
{
	 public static void main(String[] args) 
	    {
	        ArrayList<String> a = new ArrayList<>(2);
	         
	        a.add("A");
	        a.add("B");
	         
	        System.out.println(a);
	         
	     a.ensureCapacity(20);
	         
	        a.add("C");
	        a.add("D");
	       a.add("E");
	       a.add("F");
	 
	        System.out.println(a);
	    }
}

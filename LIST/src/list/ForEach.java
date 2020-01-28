package list;
import java.util.ArrayList;
public class ForEach 
{
	public static void main(String[] args)
	{
		 
        ArrayList<String> a = new ArrayList<String>(); 
  
        
        a.add("A"); 
        a.add("B"); 
        a.add("C"); 
        a.add("D"); 
  
       
        a.forEach((n) -> System.out.println(n)); 
	}
}

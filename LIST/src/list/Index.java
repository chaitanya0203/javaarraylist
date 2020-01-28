package list;
import java.util.ArrayList;
public class Index 
{
	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
        
        int firstIndex = a.indexOf("A");
         
        System.out.println(firstIndex);
         
        int SecondIndex = a.indexOf("hello");
         
        System.out.println(SecondIndex);
	}
}

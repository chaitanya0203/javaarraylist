package list;
import java.util.ArrayList;
public class Clone 
{
	  public static void main(String[] args) 
	  {
		  
		  ArrayList<String> a = new ArrayList<>(); 
	         
	        a.add("Ab");
	        a.add("Bc");
	        a.add("Cd");
	        a.add("De");
	         
	        System.out.println(a);   
	         
	
	         
	        System.out.println(a.clone());   
	  }
}

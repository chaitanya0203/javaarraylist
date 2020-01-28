package list;
import java.util.ArrayList;
import java.util.ListIterator;
public class Iterator 
{
	 public static void main(String[] args)
	 {
		 ArrayList<String> a= new ArrayList<String>();
		 a.add("Satyanaraya");
			a.add("Chaitanya");
			a.add("Kalyan Babu");
			a.add("Ganesh");
			a.add("Murali");
			
			ListIterator<String> listItr = a.listIterator();
	         
	        System.out.println("===========Forward=========");
	         
	        while(listItr.hasNext()) {
	            System.out.println(listItr.next());
	        }
	         
	        System.out.println("===========Backward=========");
	         
	        while(listItr.hasPrevious()) {
	            System.out.println(listItr.previous());
	        }
		     
	 }
}

package list;
import java.util.ArrayList;

public class Lastindex 
{
	public static void main(String[] args)
	{
		

	ArrayList<String>  a=new ArrayList<String>();
	a.add("Satyanaraya");
	a.add("Chaitanya");
	a.add("Kalyan Babu");
	a.add("Ganesh");
	a.add("Murali");
	a.add("Chaitanya");
	int lastindex = a.lastIndexOf("Chaitanya");
	int firstIndex = a.indexOf("Chaitanya");
	System.out.println(""+lastindex);
	System.out.println(""+firstIndex);
}
}
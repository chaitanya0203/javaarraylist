package list;

import java.util.ArrayList;

public class Add_All 
{
	public static void main(String[] args)
	{
	
	ArrayList<String>  a=new ArrayList<String>();
	a.add("Satyanaraya");
	a.add("Chaitanya");
	a.add("Kalyan Babu");
	a.add("Ganesh");
	a.add("Murali");
	ArrayList<String>  b=new ArrayList<String>();
	b.add("Haritha");
	a.addAll(b);
	System.out.println("list 1 is "+a);
	}
}

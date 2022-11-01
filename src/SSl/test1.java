package SSl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class test1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("ravi");
		names.add("dheeraj");
		names.add("mummy");
		names.add("priti");
		names.add("papa");
		int count = 0;

		for (int i = 0; i < names.size(); i++) 
		{

			String actual = names.get(i);
			if (actual.startsWith("A")) 
			{
				count++;
			}
               System.out.println(count);
		}
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("ravi");
		names1.add("dheeraj");
		names1.add("mummy");
		names1.add("priti");
		names1.add("papa");
	Long c=names1.stream().filter(s->s.startsWith("A")).count();
    System.out.println(c);	
    
    long d=Stream.of("abhijeet","don","ashok","adam","ram").filter(s->
    		{
    	       s.startsWith("A");
    	       return false;
    	
    		}).count();
    		System.out.println(d);
    
    
    
   
	}
}

package SSl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test2 {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("ravi");
		names.add("dheeraj");
		names.add("mummy");
		names.add("priti");
		names.add("papa");
		int count=0;
        
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
    //print all the names of ArrayList
    		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s)); 
    		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s)); 
    		
    		
    		//print names which have last letter as "a" with Uppercase
    		Stream.of("ravi","suresh","ramesh","dheeraj","messi").filter(s->s.endsWith("a"))
    		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    		
    		//print names which have first letter as a with uppercase and sorted
    		
    		List<String> names2=Arrays.asList("ravi","suresh","ramesh","dheeraj","messi");
    		names2.stream().filter(s->s.endsWith("A")).sorted()
    		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
    		}
}

package WebdriverDemos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class javaSet {
	
	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		System.out.println(s.size());
		
		s.add("London");
		s.add("Nitin");
		s.add("Delhi");
		s.add("Nitin");
		
		System.out.println(s.size());
				Iterator<String> it = s.iterator();
				
				System.out.println(it.next());
				System.out.println(it.next());
				System.out.println(it.next());
				
				while(it.hasNext()) {  // check set hold value or not 
					System.out.println(it.next()); // returns that value
				}
		
		
		
		
		
	}

}

package Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class studentMap {
	
	@Test
	public void test()
	{
		
		Integer n = Integer.parseInt("34324");  // parse function returns a integer but a takes a string
		
		System.out.println("num :"+n+ "type :" +Integer.TYPE);
		
		LinkedHashMap<Integer,String> cls = new LinkedHashMap<Integer,String>();
		
		System.out.println(cls.size());
		
		cls.put(1, " A ");
		cls.put(1, " B ");
		cls.put(1, " C ");
		
		System.out.println(cls.size());
		
		System.out.println(cls.get(2));
		
		Set<Integer> keys = cls.keySet();
		
		Iterator<Integer> it = keys.iterator();
		
		while(it.hasNext())
		{
			int key = it.next();
			
			String val = cls.get(key);
			
			System.out.println(val);
			
			val = val.trim();  // trim function trims the spaces before and after the string (not in between spaces)
			
			System.out.println(val);
			
			cls.put(key, val);
		}
		
		
	}

}

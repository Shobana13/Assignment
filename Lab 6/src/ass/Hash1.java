package ass;

import java.util.*;

public class Hash1 {
	 public static List getValues(HashMap<String,Integer> m){
		List<Integer> res=new ArrayList();
		Set keys=m.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			String key=(String) itr.next();
			Integer value=m.get(key);
			res.add(value);
		}
		Collections.sort(res);
		return res;
		
		}

public static void main(String[] args) {
	HashMap<String,Integer> m = new HashMap<String, Integer>(); 
	m.put("a", 90);  
	m.put("b", 20);  
	m.put("c",30);  
	m.put("d", 21);  
	System.out.println(getValues(m));
	
	
}
}

package ass;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hash3 {
	public static HashMap<Integer,String>getStudents(HashMap<Integer,Integer> m){
		
		HashMap<Integer, String> m1=new HashMap<Integer, String>();
		Set keys=m.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			Integer key=(Integer) itr.next();
			Integer value=m.get(key);
			if(value>=90) {
				m1.put(key,"gold");
			}
			else if(value>=80 && value<90) {
				m1.put(key,"Silver");
			}
			else {
				m1.put(key,"bronze");
			}
		}
		return m1;

}

public static void main(String[] args) {
	HashMap<Integer, Integer> m=new HashMap<Integer, Integer>();
	m.put(1,80);
	m.put(2,70);
	m.put(3,90);
	System.out.println(getStudents(m));
	
	
}
}
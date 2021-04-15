package ass;

import java.util.*;

public class Hash6 {
	public static List<Integer> votersList(Map<Integer, Integer> m){
		List<Integer> res = new ArrayList();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Integer key = (Integer) itr.next();
			if (Math.abs(m.get(key) - 2021) > 18) {
				res.add(key);
				
			}
		}
		return res;

	}

	public static void main(String[] args) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 1999);
		m.put(2, 2019);
		m.put(3, 1992);
		System.out.println(votersList(m));

	}
}

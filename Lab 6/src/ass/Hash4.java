package ass;

import java.util.*;
import java.util.Map.Entry;

public class Hash4 {

	public static HashMap<Integer, Integer> getSquare(int[] arr) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i : arr) {
			m.put(i, i * i);
		}
		return m;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(getSquare(arr));

	}
}

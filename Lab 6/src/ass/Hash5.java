package ass;

import java.util.ArrayList;
import java.util.Arrays;

public class Hash5 {
	public static int getSecondSmallest(Integer[] array) {
		Arrays.sort(array);
		System.out.println(array[1]);
		return 0;
	}

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(2);
		a1.add(5);
		a1.add(1);
		Integer[] array = a1.toArray(new Integer[0]);
		getSecondSmallest(array);
	}
}
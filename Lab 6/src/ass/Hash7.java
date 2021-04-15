package ass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Hash7 {
	static int j = 0;
	static int[] temp = new int[7];

	public static int getSorted(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[j] = arr[i];
			j++;
		}
		List<Integer> list = new ArrayList();
		for (int i : temp) {
			list.add(i);
		}
		Collections.sort(list);
		System.out.print(list);
		return 0;
	}

	public static void main(String[] args) {
		// Create a list of strings
		int[] arr = { 10, 20, 3, 40, 1, 0, 22 };
		getSorted(arr);
	}
}

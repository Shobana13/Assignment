package ass;

import java.util.Arrays;

public class Array3 {

	int[] arr = { 10, 20, 3, 40, 1, 0, 22 };
	int j = 0;
	int[] temp = new int[7];

	public int getSorted(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			// System.out.print(arr[i] +" ");
			temp[j] = arr[i];
			j++;
		}
		Arrays.sort(temp);
		for (int a : temp) {
			System.out.println(a);
		}
		return 0;
	}

	public static void main(String[] args) {
		Array3 sr = new Array3();
		sr.getSorted(sr.arr);
	}

}

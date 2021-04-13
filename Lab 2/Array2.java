package ass;
import java.util.Arrays;
public class Array2 {
	public String sortStrings(String[] arr) {
		int l = arr.length;
		for (int j = 0; j < l; j++) {
			arr[j] = arr[j].toLowerCase();
		}
		Arrays.sort(arr);
		if (l % 2 != 0) {
			int count = (l / 2) + 1;
			for (int i = 0; i < count; i++) {
				arr[i] = arr[i].toUpperCase();
				System.out.print(arr[i] + " ");
			}
			for (int i = count; i < l; i++) {
				arr[i] = arr[i].toLowerCase();
				System.out.print(arr[i] + " ");
			}
		} else {
			int count = (l / 2);
			for (int i = 0; i < count; i++) {
				arr[i] = arr[i].toUpperCase();
				System.out.print(arr[i] + " ");
			}
			for (int i = count; i < l; i++) {
				arr[i] = arr[i].toLowerCase();
				System.out.print(arr[i] + " ");
			}

		}
		return null;
	}
	public static void main(String[] args) {
		Array2 a = new Array2();
		String[] arr = { "dog", "whIte", "Cat", "blue", "EGG" };
		a.sortStrings(arr);
	}
}

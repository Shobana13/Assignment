package ass;

public class Array1 {

	static int[] num = { 5, 6, 3, 1 };

	int getSecondSmallest(int[] num) {

		for (int i = 0; i <= num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println(num[1]);
		return 0;
	}

	public static void main(String[] args) {
		// int[] num= {5,6,3,10};
		Array1 s = new Array1();
		s.getSecondSmallest(num);

	}
}

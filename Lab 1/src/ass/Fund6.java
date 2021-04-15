package ass;

public class Fund6 {

	int sum = 0;

	public int calculateSum(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		// System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		Fund6 n = new Fund6();
		System.out.println(n.calculateSum(5));

	}
}

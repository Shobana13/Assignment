package ass;

public class Fund3 {

	public int fibi(int n) {
		int n1 = 0, n2 = 1;
		int fib = 0;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 0; i <= n; i++) {
			fib = n1 + n2;
			System.out.print(fib + " ");
			n1 = n2;
			n2 = fib;
		}
		return 0;

	}

	public static void main(String[] args) {
		Fund3 f = new Fund3();
		f.fibi(5);

	}
}

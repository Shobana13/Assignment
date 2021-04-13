package ass;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String1 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		String temp = s.nextLine();
		StringTokenizer s1 = new StringTokenizer(temp, " ");
		while (s1.hasMoreTokens()) {
			String p = s1.nextToken();
			int m = Integer.parseInt(p);
			sum += m;
		}
		System.out.print(sum);
	}
}

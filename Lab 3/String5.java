package ass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class String5 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int nl = 1;
		int nw = 0;
		char ch;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		FileInputStream f = new FileInputStream(str);
		int n = f.available();
		for (int i = 0; i < n; i++) {
			ch = (char) f.read();
			if (ch == '\n') {
				nl++;
			} else if (ch == ' ') {
				nw++;
			}
		}
		System.out.println("\nNumber of lines : " + nl);
		System.out.println("\nNumber of words : " + (nl + nw));
		System.out.println("\nNumber of characters : " + n);
	}

}

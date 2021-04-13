package ass;

public class String2 {
	String rev = " ";

	public String getImage(String s) {
		int l = s.length();
		for (int i = l - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(s + "|" + rev);
		return s;
	}

	public static void main(String[] args) {
		String2 p = new String2();
		p.getImage("Earth");
	}
}



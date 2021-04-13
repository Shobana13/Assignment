package ass;

public class String3 {
	public String alterString(String str) {

		String str2 = "bcdfghjklmnpqrstvwxyzb";
		String s = str.toLowerCase();
		char[] chars = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int k = 0; k < str2.length(); k++) {
				if (s.charAt(i) == str2.charAt(k)) {
					chars[i] = str2.charAt(k + 1);
				}
			}
		}
		for (int i = 0; i < s.length(); i++) {
			System.out.print(chars[i]);
		}
		return null;
	}

	public static void main(String[] args) {
		String3 a = new String3();
		a.alterString("Java");
	}
}

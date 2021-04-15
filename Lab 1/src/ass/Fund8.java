package ass;

public class Fund8 {
	public boolean checkNumber(int n) {
		double temp = n;
		while (temp > 1) {
			temp = temp / 2;
		}
		if (temp == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Fund8 c = new Fund8();
		System.out.println(c.checkNumber(1026));
	}
}

package ass;

public class Fund7 {
	public boolean checkNumber(int number) {
		String str=Integer.toString(number);
		char[] c=str.toCharArray();
		for(int i=0;i<c.length-1;i++) {
			if(c[i]>=c[i+1]) {
				return false;
			}
		}
		return true;
			
	}
	public static void main(String[] args) {
		Fund7 i =new Fund7();
		System.out.println(i.checkNumber(6009));
	}
}




package ass;

public class Fund1 {
		int sum=0;
		public void cube(int n){
		while(n>0) {
			int temp=n%10;
			sum=sum+temp;
			n=n/10;
		}
		System.out.println("Sum: " +sum);
		System.out.println("Cube:" +sum*sum*sum);
		}
	public static void main(String[] args) {
		Fund1 c = new Fund1();
		c.cube(333);
	}

	}



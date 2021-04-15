package ass;

public class Fund5 {
	int sum=0,sum1=0;
	public int calculateDifference(int n) {
		for(int i=1;i<=n;i++) {
			int temp=i*i;
			sum=sum+temp;
			}
		System.out.println(sum);
		for(int j=1;j<=n;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1*sum1);
		int res=sum-sum1;
		return res;
	}
	public static void main(String[] args) {
		Fund5 s = new Fund5 ();
		System.out.println(("Difference:"+s.calculateDifference(5)));
		}
}




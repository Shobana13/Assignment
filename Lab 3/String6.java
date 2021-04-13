package ass;

public class String6 {
	 boolean check(String str)
		{
			int n=str.length();
			String str1=str.toLowerCase();
			for(int i=1;i<n;i++)
			{
				if(str1.charAt(i) < str1.charAt(i-1))
				{
					return false;
				}
			}
			
			return true;
			
		}

		public static void main(String[] args) {
			String6 s=new String6();
			System.out.println(s.check("Ant"));

		}

	}



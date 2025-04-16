package DsaAssignment03;

public class hw1 {
	public static int gcd(int m,int n) {
		if(n==0)
			return m;
		
		return gcd(n,m%n);
		
	}

	public static void main(String[] args) {
		System.out.println(gcd(3,7));

	}

}

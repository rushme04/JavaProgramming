package DsaAssignment03;

public class q9 {
	public static void reverse(int n) {
		if(n<10) {
			System.out.println(n);
		}
		else {
			System.out.print(n%10);
			reverse(n/10);
		}
	}

	public static void main(String[] args) {
		reverse(4735);
	}

}

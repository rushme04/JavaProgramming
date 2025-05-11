package DsaAssignment01;

public class q1 {
	public static int countDivisions(int num) {
		int count=0;
		while(num>2) {
			num/=2;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number: "+args[0]);
		int n= Integer.parseInt(args[0]);
		int d= countDivisions(n);
		System.out.println("No. of times: "+d);

	}

}

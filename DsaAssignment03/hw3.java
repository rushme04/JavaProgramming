package DsaAssignment03;

public class hw3 {
	public static void DtoB(int n) {
		if(n==0)
			return;
		
		System.out.print(n%2);
		DtoB(n/2);
	}

	public static void main(String[] args) {
		DtoB(45);
		
	}

}

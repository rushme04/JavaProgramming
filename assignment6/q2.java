package assignment6;

public class q2 {
public static int pentagonalNum(int n) {
	return n*(3*n-1)/2;
}
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
		System.out.print(pentagonalNum(i)+" ");	
		if(i%10==0) {
			System.out.println();
		}
		}

	}

}

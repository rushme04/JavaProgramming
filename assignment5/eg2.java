package assignment5;

public class eg2 {

	public static void main(String[] args) {
//		int n=10;
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
//				n--;
			}
			System.out.println();
		}

	}

}

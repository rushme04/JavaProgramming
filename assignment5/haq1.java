package assignment5;

public class haq1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				if(i!=j) {
					System.out.print(j);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}

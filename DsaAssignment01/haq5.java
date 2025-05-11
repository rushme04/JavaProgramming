package DsaAssignment01;

public class haq5 {

	public static void main(String[] args) {
		int[][]a= new int[4][4];
		System.out.println("Random generated matrix is: ");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]= (int)(Math.random()*2);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int largestRI=-1,maxRS=-1,largestCI=-1,maxCS=-1;
		for(int i=0;i<4;i++) {
			int rowSum=0;
			for(int j=0;j<4;j++) {
				rowSum+=a[i][j];
			}
			if(rowSum>maxRS) {
				maxRS=rowSum;
				largestRI=i+1;
			}
		}
		for(int j=0;j<4;j++) {
			int colSum=0;
			for(int i=0;i<4;i++) {
				colSum+=a[i][j];
			}
			if(colSum>maxCS) {
				maxCS=colSum;
				largestCI=j+1;
			}
		}
		System.out.println("The largest row index: "+largestRI);
		System.out.println("The largest column index: "+largestCI);

	}

}

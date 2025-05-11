package DsaAssignment02;
import DsaAssignment02Academics.*;
import DsaAssignment02Activities.*;
public class q10 extends test implements sports{

	public static void main(String[] args) {
		test one=new test();
		one.inputDetails("Rudra", 30);
		one.inputDetails(70, 35);
		one.showDetails();
		int grandTotal=one.mark1+one.mark2+score1+score2;
		System.out.println("Grand Total: "+grandTotal);

	}

}

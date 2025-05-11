package DsaAssignment02;

class deposit{
	long principal;
	int time;
	double rate;
	double totalAmt;
	deposit(){
		
	}
	deposit(long p,int t,double r){
		principal=p;
		time=t;
		rate=r;
		
	}
	deposit(long p,int t){
		this(p,t,2.0);
	}
	deposit(long p,double r){
		this(p,2,r);
	}
	void display() {
		System.out.println("principal: "+principal);
		System.out.println("time: "+time);
		System.out.println("rate: "+rate);
		calc_amt();
		System.out.println("totalAmt: "+totalAmt);
	}
	void calc_amt() {
		totalAmt= principal+(principal*rate*time)/100;
	}
}
public class q4 {

	public static void main(String[] args) {
		deposit one= new deposit();
		deposit two= new deposit(10000,2,2.0);
		deposit three= new deposit(20000,3);
		deposit four= new deposit(30000,1.0);
		one.display();
		two.display();
		three.display();
		four.display();
		

	}

}

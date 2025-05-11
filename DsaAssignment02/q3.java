package DsaAssignment02;
import java.util.Scanner;
class book{
	int bookid;
	double price;
	int quantity;
	static double totalAmount;
	book(int bookid,double price,int quantity){
		this.bookid=bookid;
		this.price=price;
		this.quantity=quantity;
	}
	void displayDetails() {
		System.out.println(bookid+" "+price+" "+quantity);
	}
	void calculate() {
		double cost= price*quantity;
		totalAmount+=cost;
	}
}

public class q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		book []a=new book[5];
		for(int i=0;i<5;i++) {
			System.out.println("Enter bookid: ");
			int bid=sc.nextInt();
			System.out.println("Enter price: ");
			double pr=sc.nextDouble();
			System.out.println("Enter quantity: ");
			int quan=sc.nextInt();
			a[i]= new book(bid,pr,quan);
			a[i].calculate();
		}
		for(int i=0;i<5;i++) {
			a[i].displayDetails();
		}
		System.out.println("Total Amount: "+book.totalAmount);
	}

}

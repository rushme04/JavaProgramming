package assignment6;

public class q4 {
public static int numberOfDaysInaYear(int year) {
	if((year%4==0 && year%100!=0)|| year%400==0) {
		return 366;
	}
	else {
		return 365;
	}
}
	public static void main(String[] args) {
		for(int i=2000;i<=2020;i++) {
			System.out.println(i+ " have "+numberOfDaysInaYear(i)+ " days.");
		}

	}

}

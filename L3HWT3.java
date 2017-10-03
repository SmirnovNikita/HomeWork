package ttt;
import java.util.Scanner;
public class L3HWT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int day;
		System.out.println("Input amount of day");
		day=sc.nextInt();
		if (day%4==0 || day%400==0) {
			System.out.println("In the year 366 days");
		}else {
			System.out.println("In the year 365 days");
		}
		sc.close();
		

	}

}

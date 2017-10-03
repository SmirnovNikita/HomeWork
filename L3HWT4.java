package ttt;
import java.util.Scanner;
public class L3HWT4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a;
		System.out.println("Input side a");
		a=sc.nextDouble();
		double b;
		System.out.println("Input side b");
		b=sc.nextDouble();
		double c;
		System.out.println("Input side c");
		c=sc.nextDouble();
		if(a+b>c && a+c>b && c+b>a) {
			System.out.println("Triangle is exist");
		}else {
			System.out.println("Triangle is invalid");
		}
		sc.close();
		

	}

}

package ttt;
import java.util.Scanner;
public class L3HWT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int max;
		System.out.println("Input number a");
		a=sc.nextInt();
		System.out.println("Input number b");
		b=sc.nextInt();
		System.out.println("Input number c");
		c=sc.nextInt();
		System.out.println("Inmput number d");
		d=sc.nextInt();
		max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		if(d>max) {
			max=d;
		}
		System.out.println("Max="+max);
		sc.close();

	}

}

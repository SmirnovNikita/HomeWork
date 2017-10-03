package ttt;
import java.util.Scanner;
public class HomeWorkL1T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int factorial=1;
		System.out.println("Input number 4<n<16");
		n=sc.nextInt();
		if(n>4 && n<16) {
			for(int i=n;i>0;i--) {
				factorial*=i;
			}
			System.out.println("Factorial="+factorial);
		}else {
			System.out.println("number is invalid");
			
		}
		sc.close();
		

	}

}

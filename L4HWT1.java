package ttt;
import java.util.Scanner;
public class L4HWT1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int column;
		System.out.println("number of column");
		column=sc.nextInt();
		for(int j=0;j<5;j++) {
		for(int i=1;i<=column;i++) {
			if(i%2==0) {
				System.out.print("+++");
			}else {
				System.out.print("***");
			}
		}
		System.out.println();
		}
		sc.close();
		

	}

}

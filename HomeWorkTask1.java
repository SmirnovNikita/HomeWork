package math;
import java.util.Scanner;

public class HomeWorkTask1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("¬ведите число");
		number=sc.nextInt();
		int partOne=number/10000;
		int partTwo=number%10000/1000;
		int partThre=number%1000/100;
		int partFor=number%100/10;
		int partFive=number%10/1;
		System.out.println(partOne);
		System.out.println(partTwo);
		System.out.println(partThre);
		System.out.println(partFor);
		System.out.println(partFive);
		sc.close();
	}

}

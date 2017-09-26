package math;
import java.util.Scanner;
public class HomeWorkTask2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sideA;
		System.out.println("Input side triangle A");
		sideA=sc.nextDouble();
		double sideB;
		System.out.println("Input side triangle B");
		sideB=sc.nextDouble();
		double sideC;
		System.out.println("Input side triangle C");
		sideC=sc.nextDouble();
		double semiPerimeter=(sideA+sideB+sideC)/2;
		double area=Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
		System.out.println("Half perimeter triangle="+semiPerimeter);
		System.out.println("Area triangle="+area);
		sc.close();
	}

}

package math;
import java.util.Scanner;
public class HomeWorkTask2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sideA;
		System.out.println("������� ������� ������������ �");
			sideA=sc.nextDouble();
	double sideB;
		System.out.println("������� ������� ������������ B");
			sideB=sc.nextDouble();
	double sideC;
		System.out.println("������� ������� ����������� C");
			sideC=sc.nextDouble();
	double semiPerimeter=(sideA+sideB+sideC)/2;
	double area=Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));
	System.out.println("������������ ������������="+semiPerimeter);
	System.out.println("������� ������������="+area);
	sc.close();
	}

}

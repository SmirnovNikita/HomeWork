package math;
import java.util.Scanner;
public class HomeWorkTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double radius;
		System.out.println("¬ведите радиус круга");
		radius=sc.nextDouble();
		double lengthCircle=2*Math.PI*radius;
		System.out.println("ƒлина круга="+lengthCircle);
		sc.close();

	}

}

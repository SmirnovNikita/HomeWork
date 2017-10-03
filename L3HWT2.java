package ttt;
import java.util.Scanner;
public class L3HWT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numberApartment;
		int floor;
		System.out.println("Inpunt number apartment");
		numberApartment=sc.nextInt();
		if(numberApartment<0 || numberApartment>144) {
			System.out.println("Number apartment is invalide");
		}else if(0<numberApartment && numberApartment<37) {
			System.out.println("Entrance 1");
				
		}
		if(36<numberApartment && numberApartment<73) {
			System.out.println("Entrance 2");
			
			
		}
		if(72<numberApartment && numberApartment<109) {
			System.out.println("Entrance 3");
		}
		if(108<numberApartment && numberApartment<145) {
			System.out.println("Entrance 4");
			
			
		}
		floor=numberApartment%36;
		if(0<floor && floor<=4) {
			System.out.println("Floor 1");
		}
		if(4<floor && floor<=8) {
			System.out.println("Floor 2");
		}	
		if(8<floor && floor<=12) {
			System.out.println("Floor 3");
		}
		if(12<floor && floor<=16) {
			System.out.println("Floor 4");
		}
		if(16<floor && floor<=20) {
			System.out.println("Floor 5");
		}
		if(20<floor && floor<=24) {
			System.out.println("Floor 6");
		}
		if(24<floor && floor<=28) {
			System.out.println("Floor 7");
		}
		if(28<floor && floor<=32) {
			System.out.println("Floor 8");
		}
		if(32<floor && floor<=36) {
			System.out.println("Floor 9");
		}
		if(numberApartment==36){
			System.out.println("Floor 1");
		}
		if(numberApartment==72) {
			System.out.println("Floor 2");
		}
		if(numberApartment==108) {
			System.out.println("Floor 3");
		}
		if(numberApartment==144) {
			System.out.println("Floor 4");
		}
		
		sc.close();




	}

}

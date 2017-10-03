package ttt;

import java.util.Scanner;

public class L4HWT4 {

	public static void main(String[] args) {
		// TODO Auto-gener ated method stub
		Scanner sc = new Scanner(System.in);
		int height;
		System.out.println("Input height");
		height = sc.nextInt();
		int width;
		System.out.println("Input  width");
		width = sc.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
		sc.close();

	}

}

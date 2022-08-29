package MiniProjects;

import java.util.Scanner;

public class EvenNomber {

	public static void main(String[] args) {
		// EVEN numbers
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no of Even numbers : ");
		int count = sc.nextInt();
		for (int i = 0; i <= count; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// ODD numbers
		System.out.print("enter the no of ODD numbers : ");
		int count1 = sc.nextInt();
		for (int i = 0; i <= count1; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}

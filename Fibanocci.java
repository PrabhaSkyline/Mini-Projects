package MiniProjects;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3;
		System.out.print("Enter how many numbers you wanna print : ");
		int count = sc.nextInt();
		System.out.println(n1 + "\n" + n2);
		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println("" + n3);
		}

	}

}

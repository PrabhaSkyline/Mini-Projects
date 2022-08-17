package Calculator;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principle amount : ");
		float P = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter the Annuel Rate of Interest : ");
		float R =  sc.nextFloat();
		System.out.print("Enter the number of years : ");
		float N = sc.nextFloat();
		
		//formula SI =( P*N*R)/100
		  float SI = (P*N*R)/100;
		  
		System.out.print("Simple Interest is : "+SI);
	}

}

package MiniProjects;

import java.util.Scanner;

public class CeaserEncrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the text to encrypt : ");
		String text = sc.nextLine();
	
		//Encrypting data
	//	String text = "abc";
		char[] c =text.toCharArray();
		for(char i:c){
			i+=2;
			System.out.print(i);
		}
		
		System.out.println();
		
		//Decrypting data
		System.out.print("Enter the data to be decrypt : ");
		String text1 = sc.nextLine();
	//	String text1 = "cde";
		char[] c1 =text1.toCharArray();
		for(char i:c1){
			i-=2;
			System.out.print(i);
		}
	}

}

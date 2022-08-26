package MiniProjects;

public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Radar";
		String reverse ="";
		for (int i = name.length()-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
	//	System.out.println(reverse);
		if(name.equalsIgnoreCase(reverse))
		{
			System.out.println("its a palindrom");
		}
		else 
		{
			System.out.println("its not a palindrom");
		}
	}
}

package Que1;
import java.util.Scanner;

//Take a string from User and Print letter whose Successor is a digit.

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		sc.next();
		
		PrintLeter(str);
		
	}

	public static void PrintLeter(String str) {
		
		for(int i=1;i<str.length();i++)
		{
			if((str.charAt(i)) == '0'|| (str.charAt(i)) == '1' || (str.charAt(i)) == '2' || (str.charAt(i)) == '3' || (str.charAt(i)) == '4' || (str.charAt(i)) == '5' || (str.charAt(i)) == '6' || (str.charAt(i)) == '7' || (str.charAt(i)) == '8' || (str.charAt(i) == '9' ) )
			{
				System.out.print((str.charAt(i-1)));
			}	
			System.out.print("");
		}
	}
}

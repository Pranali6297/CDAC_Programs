package ReveseWord;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] strarr = str.toCharArray();
		
		Reverse.reverse(strarr, 0,str.length()-1);
		for(int i = 0;i<strarr.length;i++)
		{
			System.out.print(strarr[i]);
		}
		
		Reverse.reverseWord(strarr, 0,str.length()-1);
		for(int i = 0;i<strarr.length;i++)
		{
			System.out.print(strarr[i]);
		}
		
		
	}

}

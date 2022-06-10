package Anagram;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
	
		System.out.println("Enter a Second String");
		String str2 = sc.nextLine();
		
		StringBuffer s1 = new StringBuffer(str1);
		StringBuffer s2= new StringBuffer(str2);
	
		Boolean Result =CheckAnagram(s1,s2);
		if(Result == true)
		{
			System.out.println("The given Strings are Anagram.");	
		}
		else
			System.out.println("The given Strings are Not Anagram.");
	
	}
	
	public static Boolean CheckAnagram(StringBuffer s1,StringBuffer s2)
	{
		if(s1.length() != s2.length())
			return false;
		
		for(int i =0;i<s1.length();i++)
		{
			for(int j =0;j<s1.length()-1;j++)
			{
				if(s1.charAt(i)>s1.charAt(j))
				{
					char ch = s1.charAt(i);
					s1.setCharAt(i,s1.charAt(j));
					s1.setCharAt(j, ch);
				}
				if(s2.charAt(i)<s2.charAt(j))
				{
					char ch = s2.charAt(i);
					s2.setCharAt(i,s2.charAt(j));
					s2.setCharAt(j, ch);
				}
			}
			if(s1.toString().equals(s2.toString()))
			{
				return true	;
			}
		}
		return true;
	}
	

}

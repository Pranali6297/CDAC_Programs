package Que2;

import java.util.Scanner;

public class TrancateExtraSpace {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		sc.next();
		
		Extstring(str);
	}

	public static void Extstring(String str) {
		
		StringBuffer str2=new StringBuffer(str.length());
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')// &&str.charAt(i+1)!=' ')
		
		    {  
             str2.append(str.charAt(i));
        
		    }
			else
			{ //means i at some space........
				
				    if(str.charAt(i+1)!=' ')//it will check if i's next character is alphabet if yes then add space
				
				        str2.append(' ');
				
		     }
			
		}
		
	System.out.println(str2);	
		
	}
}

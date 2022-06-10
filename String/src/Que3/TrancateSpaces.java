package Que3;

import java.util.Scanner;

public class TrancateSpaces {
	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
//		sc.next();
		
		Extstring(str);
	}

	public static void Extstring(String str) { // this  is    new  string // this is new string
		
		    char[] strArray = str.toCharArray();  
		    
	        StringBuffer str2 = new StringBuffer();  
	        
	        for (int i = 0; i < strArray.length; i++)
	        {  
	            if (strArray[i] == ' ') 
	            { 
	            	str2.append(strArray[i]);
	            } 
	            
	        }
	        
	      /*  String Space = str2.toString();
	        System.out.println(str2.toString());
	        
	        for (int i = 0; i < strArray.length; i++)
	        {   
	            if((strArray[i] != ' '))
	            {
	            	str2.append(strArray[i]);
	            }
	        }
	        
	        String Letters = str2.toString();*/
	        System.out.println(str2.toString());    
	}

}

//&& (strArray[i] != '\t')

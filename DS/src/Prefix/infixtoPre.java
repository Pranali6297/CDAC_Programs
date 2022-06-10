package Prefix;

public class infixtoPre {
	public static void main(String[] args) {
		String infix = "a+b*c+d";
		
		String s = Prefix.infixToPrefix(infix);
		
		System.out.println("The Prefix of "+infix+" = "+s);
	}


}

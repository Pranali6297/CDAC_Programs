package Postfix;

public class InfixtoPost {

public static void main(String[] args) {
		
		String infix = "a+b*c+d";
		
		String s = Postfix.infixToPostfix(infix);
		
		System.out.println("The Postfix of "+infix+" = "+s);
	}

}

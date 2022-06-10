package BracketCheck;
public class Main {

	public static void main(String[] args) {

		String exp = new String ("{9+(8*5)-3}");
		if(validExp.check(exp))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}

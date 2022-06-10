package Evalution;

public class main {

	public static void main(String[] args) {
		
		String str ="24+56+*5";
		int ans = EvaPostfix.eval_post(str);
		System.out.println(ans);
	}

}

package BracketCheck;
public class CharStack {
	Node top;
	 
	static class Node
	{
		char data;
		Node Next;
		
		Node(char d)
		{
			data = d;
		}
	}
	
	public boolean isEmpty()
	{
	if(top==null)
	return true;
	else
		return false;
	}
	
	public char peek()
	{
		if(top == null)
			return '*';
		else 
			return top.data;
	}
	
	public void push(char d)
	{
		Node newNode = new Node(d);
		if(top == null)
			top = newNode;
		else {
			newNode.Next = top;
			top = newNode;
		}
	}
	
	public char pop()
	{
		char data;
		data = top.data;
		top = top.Next;
		return data;
	}		
}

class validExp
{
	  static boolean match(char a, char b)
	 {
		if(a=='['&& b==']') 
			return true;
		if(a=='{' && b== '}')
			return true;
		if(a== '(' &&  b==')')
			return true;
		else
			return false;
	}
	
	public static boolean check(String exp)//"{9+(8*5)-3}"
	{
		int i;
		char temp;
		CharStack CS = new CharStack();
		for(i =0;i<exp.length();i++)
		{
			if(exp.charAt(i)=='(' || exp.charAt(i)=='[' )
			{
				CS.push(exp.charAt(i));
			}
			if(exp.charAt(i)==')' || exp.charAt(i)==']' )
			{
				if(CS.top == null)//stack empty
				{
					System.out.println("Right Parantheses");
					return false;
				}
			} 
			else
			{
					temp = CS.pop();
					if(!(match(temp,exp.charAt(i))))  
					{
						System.out.println("Mismatch Parantheses are :"+temp+" ,"+exp.charAt(i));
						return false;
					}
			}
		}		
		//for loop end
		
		if(CS.top == null) 
		{	System.out.println("Balanced");
			return true;
		}
		else
		{
			System.out.println("Left Parantheses are more ");
			return false;
		}
	}//Match Method is Completed
}
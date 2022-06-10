package Postfix;

public class CharStackPost {
	Node top;

	class Node
	{
		char data;
		Node Next;

		Node(char d)
		{
			data = d;
		}
	}

	public boolean isempty()
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

}//End

class Postfix
{
	public static int prec(char Symbol)
	{
		switch(Symbol)
		{
		case '(' :return 0;
				  
		case '+' :
		
		case '-' :return 1;
		
		case '*' :
		
		case '/' :
			
		case '%' :return 2;
		
		case '^' :return 3;
		
		default : return 0;
		}	
	}
		
	public static String infixToPostfix(String infix)
	{
		CharStackPost st = new CharStackPost();
		int i,p=0;
		char symbol,Next;
		char post[] = new char[infix.length()+1];
		for(i=0;i<infix.length();i++)
		{
			symbol = infix.charAt(i);
			if(symbol != 32 )
			{
				switch(symbol)
				{
				case '(' : st.push(symbol);
							break;
				case ')' : while((Next=st.pop()) != '(')
							post[p++]=Next;
							break;
				case '+' :
					
				case '-' :
				
				case '*' :
				
				case '/' :
					
				case '%' :
				
				case '^' :
						while( (!st.isempty()) && prec(st.peek()) >= prec(symbol))
						post[p++] = st.pop();
						st.push(symbol);
						break;
				default :post[p++] = symbol;

			}
			}	
		}//end of for
		while(!st.isempty())
		post[p++] = st.pop();
		
		String postfix = new String(post);
		return postfix;
	}//End of Function
}

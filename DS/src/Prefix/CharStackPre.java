package Prefix;

public class CharStackPre {
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

class Prefix
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
		
	public static String infixToPrefix(String infix)
	{
		CharStackPre st = new CharStackPre();
		int i,p=0;
		char symbol,Next;
		char pre[] = new char[infix.length()];
		for(i=infix.length()-1;i>=0;i++)
		{
			symbol = infix.charAt(i);
			if(symbol != 32 )
			{
				switch(symbol)
				{
				case ')' : st.push(symbol);
							break;
				case '(' : while((Next=st.pop()) != ')')  
							pre[p++]=Next;
							break;
				case '+' :
					
				case '-' :
				
				case '*' :
				
				case '/' :
					
				case '%' :
				
				case '^' :
						while( (!st.isempty()) && (prec(st.peek()) > prec(symbol)))
						pre[p++] = st.pop();
						st.push(symbol);
						break;
				default :pre[p++] = symbol;

			}
			}	
		}//end of for
		while(!st.isempty())
		pre[p++] = st.pop();
		//Reverse the String
		String prefix = new String(pre);
		String Fprefix= " ";
		char ch;
		for (int i1=0; i1<prefix.length(); i1++)
	      {
	        ch= prefix.charAt(i1); //extracts each character
	        Fprefix= ch+prefix; //adds each character in front of the existing string
	      }
		return Fprefix;
	}//End of Function
}
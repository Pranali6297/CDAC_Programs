package PostPre;

public class PostfixToPrefix {
	
	public String PosttoPre(String post)
	{
		String op1,op2,str,temp;
		char symbol;
		int i;
		
		StringStack st = new StringStack();
		
		char p[] = post.toCharArray();
		for(i=0;i<p.length;i++)//(i=p.length-1;i<=0;i++)for posttopre
		{
			symbol=p[i];
			
			temp=new String(Character.toString(symbol));
			
			if(symbol != 32)
			{
				switch(symbol)
				{
				case  '+' :
				case  '-' :
				case  '*' :
				case  '/' :
				case  '%' :
				case  '^' :
					op1=new String(st.pop());
					op2=new String(st.pop());
					str=new String(temp).concat(op2).concat(op1);
				default :st.push(temp);
				}
			}
		}//end of for
		return (st.pop());
	}//End of Function

}

class StringStack {
	Node top;

	class Node
	{
		String data;
		Node Next;

		Node(String d)
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

	public String peek()
	{
		if(top == null)
			return "*";
		else 
			return top.data;
	}

	public void push(String d) 
	{
		Node newNode = new Node(d);
		if(top == null)
			top = newNode;
		else {
			newNode.Next = top;
			top = newNode;
		}		
	}
	
	public String pop()
	{
		String data;
		data = top.data;
		top = top.Next;
		return data;
	}

}//End of String Stack

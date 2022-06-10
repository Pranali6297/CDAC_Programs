package Evalution;

public class EvaPostfix {
	
	
	static int pow(int n,int m)
	{
	int p=1;
	int i;
	for(i=1;i<=m;i++)
	{
		p=p*n;
	}
	return p;
	}

	static int eval_post(String post)
	{
		IntStack st = new IntStack();
		int a = 0,b = 0,temp = 0,result;
		
		char []p = post.toCharArray();
		for(int i=0;i<p.length;i++)
		{
			if(p[i]>='0' && p[i] <= '9')
				st.push(p[i] - 48);
			else
			{
				if(!st.isEmpty())
					a=st.pop();
				if(!st.isEmpty())
					b=st.pop();
				
				switch(p[i])
				{
				case '+' : temp = b+a;
							break;
				case '-' : temp = b-a;
							break;
				case '*' : temp = b*a;
							break;
				case '/' : temp = b/a;
							break;
				case '%' : temp = b%a;
							break;
				case '^' : temp=pow(b,a);
							break;
				}
				st.push(temp);
			}//end of else
		}//end of for
		
		result =st.pop();
		return result;
	}//end of function

}
class IntStack {
	Node top;
	 
	static class Node
	{
		int data;
		Node Next;
		
		Node(int d)
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
	
	public int peek()
	{
		if(top == null)
			return 0;
		else 
			return top.data;
	}
	
	public void push(int d)
	{
		Node newNode = new Node(d);
		if(top == null)
			top = newNode;
		else {
			newNode.Next = top;
			top = newNode;
		}
	}
	
	public int pop()
	{
		int data;
		data = top.data;
		top = top.Next;
		return data;
	}		
}//End of IntStack


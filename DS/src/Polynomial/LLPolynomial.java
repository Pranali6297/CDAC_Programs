package Polynomial;

public class LLPolynomial {

	public static void main(String[] args) {
		
		Polynom poly = new  Polynom();
		poly.insert(7,4);
		poly.insert(4,2);
		poly.insert(2,1);
		poly.insert(3,8);
		poly.insert(5,6);
		poly.insert(8,3);
		
		poly.display();
	}

}

class Polynom
{
	polyNode start;
	
	public void insert(double co,int ex)
	{
		polyNode newnode = new polyNode(co,ex);
		
		if((start==null) ||(ex >= start.expo)) // insert first
		{
			newnode.next = start;
			start = newnode;
			return;
		}
		
		polyNode it = start;
		while((it.next!=null) && (it.next.expo >= ex))
		{
			it=it.next;
		}
		if(ex==it.expo)
		{
			it.coeff = it.coeff + co;
			return ;
		}
		else
		{
			newnode.next =it.next;
			it.next = newnode;
		}
	}
	
	public void display()
	{
		if(start == null)
		{
			System.out.println("Zero Polynomial...");
			return ;
		}
		polyNode it = start;
		while(it != null)
		{
			System.out.print(it.coeff+"x^"+it.expo);
			it=it.next;
			if(it!= null)
				System.out.print(" + ");
			else
				System.out.print(" \n ");
		}
	}

}
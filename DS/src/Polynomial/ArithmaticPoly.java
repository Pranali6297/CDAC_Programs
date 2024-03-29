package Polynomial;

public class ArithmaticPoly {

	public static void main(String[] args) {
		Polynom poly = new  Polynom();
		poly.insert(7,4);
		poly.insert(4,2);
//		poly.insert(2,1);
//		poly.insert(3,8);
//		poly.insert(5,6);
//		poly.insert(8,3);
		
//		poly.display();
		
		Polynom polynom = Polynom2.polyAdd(poly);
		polynom.display();

	}

}

class Polynom2{
	static polyNode start;
	
	public void insert(double co,int ex)
	{
		polyNode newNode=new polyNode(co, ex);
		
		if(start==null || ex>start.expo) {
			newNode.next=start;
			start=newNode;
			return;
		}
		
		polyNode it=start;
		while(it.next!=null && it.next.expo>=ex) {
			it=it.next;
		}
		
		if(ex==it.expo) {
			it.coeff=it.coeff+co;
			return;
		}
		newNode.next=it.next;
		it.next=newNode;
		return;
	}
	
	//expo merge sort
	public static Polynom polyAdd(Polynom p2) {
		Polynom poly3=new Polynom();
		polyNode it1=start;
		while(it1!=null) {
			poly3.insert(it1.coeff, it1.expo);
			it1=it1.next;
		}
		
		polyNode it2=p2.start;
		while(it2!=null) {
			poly3.insert(it2.coeff, it2.expo);
			it2=it2.next;
		}
		 return poly3;
	}
	
	//Polynomial Multiply
	public Polynom polyMultiply(Polynom p2) {
		Polynom poly3=new Polynom();
		polyNode it1=start;
		polyNode it2=p2.start;
		while(it1!=null) {
			double co=0;
			int expo=0;
			while(it2!=null) {
				co=it1.coeff*it2.coeff;
				expo=it1.expo+it2.expo;
				poly3.insert(co, expo);
				it2=it2.next;
			}
			it2=p2.start;
			it1=it1.next;
		}
		return poly3;
	}

	public void display() {
		if(start==null) {
			System.out.println("Zero Polynomial");
			return;
		}
		polyNode it=start;
		while(it!=null) {
			System.out.print(it.coeff+"x^"+it.expo);
			it=it.next;
			if(it!=null)
				System.out.print(" + ");
			else
				System.out.print("\n");
		}
		return;
	}
}

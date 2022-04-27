#include<iostream>
using namespace std;

class complex
{
	int img;
	int real;
	
	public:
		
	complex()//default constructor
	{
		img = 0;
		real = 0;
	}
		
}


int main()
{
	complex c1(4,5);
	complex c3;
	
	c1.display();
	c2.display();
	
	c2 = c1;
	c2.display();
	
	c3 = c1+c2;
	c3.display;
	
	c1.setReal();
	complex c4;
	
	c1.display();
	c4.display();
	
	return 0;
}

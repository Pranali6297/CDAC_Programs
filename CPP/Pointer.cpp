#include<iostream>
using namespace std;

class array
{
	int *arr;
	int size;
	
	public:
		
	array()
	{
		arr = NULL;
	}
	
	array(int s)
	{
		size = s;
		arr = new int [size];
	}
	
	void acceptValue()
	{
		int i;
		cout<<"Enter"<<size<<" Number";
		for(i = 0;i<size;i++)
		{
			cin>>arr[i];	
		}
	}
	
	void setEle(int ele,int pos)
	{
		arr[pos]=ele;
	}
	
	void display()
	{
		int i;
		for(i = 0;i<size;i++)
		{
			cout<<arr[i]<<" ";
		//	cout<<"\n";
		}		
	}
	
	~array()//Destructor
	{
		delete arr;
		cout<<"\nDestructor";
	}
	
	array(array &o)//copy constructor(to dopass by refrance insted of pass by value)
	{
		size = o.size;
		arr = new int[size];
		for(int i =0;i<size;i++)
		{
			arr[i]=o.arr[i];
		}	
			cout<<"\ncopy constructor";
	}
	
	array operator=(const array &o)//Assignment operator
	{
		delete arr;
		size = o.size;
		arr = new int[size];
		for(int i =0;i<size;i++)
		{
			arr[i]= o.arr[i];
		}
		cout<<"\nAssignment Operator";
	}
};

int main()
{
	array obj(5);//will creates size array of 10 elements on heap;
	array obj3;
	
	obj.acceptValue();//{3,4,5,6,8}
	obj.display();
	
	array obj2(obj);
	obj2.display();
	
	obj3=obj;//obj3.operator(obj)
	obj3.setEle(500,4);
	obj3.display();
	
	obj.display();
	obj2.display();
	return 0;
}

#include<iostream>
using namespace std;

void swapVal(int,int);
void swapAdd(int *,int *);
void swapRef(int &,int &);
/*
void swapVal(int n1,int n2);
void swapAdd(int *n1,int *n2);
void swapRef(int &n1,int &n2);
*/
int main()
{
	int num1 = 10, num2=20;
	swapVal(num1,num2);//No Effect
	cout<<"After Swap by Value num1 = "<<num1<<"num2 ="<<num2;

	swapAdd(&num1,&num2);//Swapping is done
	cout<<"After Swap by Address num1 = "<<num1<<"num2 ="<<num2;

	swapRef(num1, num2 );//Swapping is Done
	cout<<"After Swap by Refrance num1 = "<<num1<<"num2 ="<<num2;
}

void swapVal(int n1,int n2)
{
	int temp;
	temp = n1;
	n1 = n2;
	n2 = temp;
}

void swapAdd(int *n1,int *n2)
{
	int temp;
	temp = *n1;
	*n1 = *n2;
	*n2 = temp;
}

void swapRef(int &n1,int &n2)
{
	int temp;
	temp = n1;
	n1 = n2;
	n2 = temp;
}

#include<iostream>
using namespace std;

int no(int &a,int &b){
	int temp;
  	temp = a;
  	a=b;
  	b=temp;
}
int main(){
	int a,b;
  	cin>>a>>b;
  	cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;;
  	no(a,b);
  	cout<<"After swapping a= "<<a<<" and b="<<b<<endl;
}
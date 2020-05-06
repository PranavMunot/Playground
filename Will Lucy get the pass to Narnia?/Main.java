#include<iostream>
using namespace std;
int main(){
int a,b,c,x;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu"<<endl;
  cout<<"1.Addition"<<endl;
  cout<<"2.Subtraction"<<endl;
  cout<<"3.Multiplication"<<endl;
  cout<<"4.Division"<<endl;
  cout<<"5.Remainder"<<endl;
  cin>>c;
  switch(c){
    case 1:
      x=a+b;
      break;
    case 2:
      x=a-b;
      break;
    case 3:
      x=a*b;
      break;
    case 4:
      x=a/b;
      break; 
    case 5:
      x=a%b;
      break;
    default:
      x=1001;
      break;
  }
  if(x==1001){
  	cout<<"Invalid operation"<<endl;
  }
  else
  	cout<<x<<endl;
  
}
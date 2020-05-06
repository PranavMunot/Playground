#include<iostream>
using namespace std;
int main()
{
int b,c;
  float a;
  cin>>a>>b>>c;
  int car = a*b;
  if(car>=c){
  	cout<<"Can reach"<<endl;
  }
  else{
  	cout<<"Cannot reach"<<endl;
  }
}
#include<iostream>
using namespace std;
int main()
{
  int a,b,c,x,y,res;
  cin>>a>>b>>c;
  x=b*75;
  y=c*30;
  res = x+y;
  
  if (res>a){
  	cout<<"Boat will drow"<<endl;
  }
  else{
  cout<<"Boat is stable"<<endl;
  }
}
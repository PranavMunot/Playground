#include<iostream>
using namespace std;
int main()
{
  int r,a;
  cin>>r>>a;
  int d = r*2;
  if(d>a){
  cout<<"circle cannot be inside a square"<<endl;
  }
  else{
  cout<<"circle can be inside a square"<<endl;
  }
}
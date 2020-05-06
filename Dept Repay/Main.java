#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  float w,x,y,z;
  cin>>a>>b>>c;
  w=float(a*b*c/100);
  float amt = float(a+w);
  float disc = float(w * 0.02);
  float total = float(amt - disc);
  cout<<w<<'\n';
  cout<<amt<<'\n';
  cout<<disc<<'\n';
  cout<<total<<'\n';
}
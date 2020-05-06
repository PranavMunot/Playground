#include<iostream>
using namespace std;
int main()
{
  float d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  c1 = c1*0.01;
  c2 = c2*0.01;
  float c = c1+c2;
  float d = d1+d2;
  float res = c+d;
  res = res*100;
  int x =(int)res%100;
  int r = (int)res /100;
  cout<<r<<'\n'<<x<<endl;
}
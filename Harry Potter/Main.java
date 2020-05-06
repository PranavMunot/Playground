#include<iostream>
using namespace std;
int main()
{
  char a[4];
  int res1,res2;
  cin>>a;
  a[0]= a[0]-'0';
  a[3]= a[3]-'0';
  res1 = (int)a[0];
  res2 = (int)a[3];
  cout<<res1+res2;
}
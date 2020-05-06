#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x,y,sum;
  cin>>x;
  cin>>y;
  x=x-3;
  y=y-4;
  x=x*x;
  y=y*y;
  sum=x+y;
  sum=sqrt(sum);
  cout<<sum<<endl;
}
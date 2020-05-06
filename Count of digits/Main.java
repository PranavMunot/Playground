#include<iostream>
using namespace std;
int main()
{
  int i=0,in,out;
  cin>>in;
  do{
  out = in % 10;
    i++;
    in = in/10;
  }while(in>0);
  cout<<i<<endl;
}
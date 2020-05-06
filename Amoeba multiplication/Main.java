#include<iostream>
using namespace std;
int main()
{
  	int n=0,i=0;
  cin>>n;
  int temp;
  int prev = 1,prev_1 = 0;
  while(i<=n-3){
  	temp = prev+prev_1;
    prev_1 = prev;
    prev = temp;
    i++;
  }
  cout<<temp;
}
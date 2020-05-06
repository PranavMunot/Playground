#include<iostream>
using namespace std;

int main()
{
  int ip,out;
  cin>>ip;
  int a[ip];
  for(int i=0;i<ip;i++){
  	cin>>a[i];
  }
  int high = a[0];
  for(int i=1;i<ip;i++){
  	if(high<a[i]){
    	high=a[i];
    }
  }
  cout<<high;
}
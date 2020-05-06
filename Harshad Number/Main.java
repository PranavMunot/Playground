#include<iostream>
using namespace std;
int main()
{
  int i,n,sum=0;
  cin>>n;
  i=n;
  while(n>0){
  	int x =n%10;
    sum = sum + x;
    n=n/10;
  }
  if(i%sum == 0){
  	cout<<"Harshad Number"<<endl;
  }
  else{
  	cout<<"Not Harshad Number"<<endl;
  }
  
}
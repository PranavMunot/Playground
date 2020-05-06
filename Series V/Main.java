#include<iostream>
using namespace std;
int main()
{
  int n,sum,add;
  cin>>n;
  for(int i=0;i<n;i++){
  	if(i==0){
    	sum=121;
      	add = 104;
    }
    else{
    	sum = sum + add;
      	add=add+32;
    }
    cout<<sum<<" ";
  }
}
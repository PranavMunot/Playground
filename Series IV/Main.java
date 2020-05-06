#include<iostream>
using namespace std;
int main()
{
  int n,count=0,sum=0,add=0;
  cin>>n;
  for(int i=0;i<n;i++){
  	if(i==0){
    	sum=0;
      	add=2;
      count=1;
    }
    else{
    	sum=sum+add;
      count++;
      if(count%2==0){
        add=add+4;
      }
    }
    cout<<sum<<" ";
  }
}

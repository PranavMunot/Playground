#include<iostream>
using namespace std;
int main()
{
  int n,add=0;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++){
  	cin>>a[i];
  }
  cout<<"1"<<endl;
  for(int i=1;i<n;i++){
  	if(a[i]>a[i-1]){
    	add=add+2;
      	cout<<add<<endl;
    }
    else{
    	cout<<"1"<<endl;
    }
  }
}
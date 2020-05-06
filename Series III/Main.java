#include<iostream>
using namespace std;

int main(){
	int n,sum=0,mul=0;
  	cin>>n;
  	for(int i=1;i<=n;i++){
      if(i==1){
      	sum=6;
        mul=i*5;
      }
      else{
      	sum=sum+mul;
        mul=i*5;
      }
   	cout<<sum<<" "; 
    }
  
}
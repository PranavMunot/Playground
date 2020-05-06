#include<iostream>
using namespace std;

int main(){
	int n,extra_add=0,sum=0;
  cin>>n;
  	for(int i=0;i<n;i++){
    	if(i==0){
        	sum=121;
          	extra_add=104;
        }
      else{       	
      		sum=sum+extra_add;
        extra_add = extra_add + 32;
      }
      cout<<sum<<" ";
    }
}
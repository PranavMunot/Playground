#include<iostream>
using namespace std;
int main(){
int ip1,ip2,sum=0;
  cin>>ip1>>ip2;
  for(int i=ip1;i<=ip2;i++){
    sum =0;
  	for(int j=1;j<i;j++){
    	if(i%j==0){
        	sum = sum + j;
        }  
    }
    // cout<<sum<<" "<<i<<endl;
    if(sum!=1&&sum==i){
    cout<<sum<<" ";
    }
  }
}
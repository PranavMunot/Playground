#include<iostream>
using namespace std;
int main(){
int n,mul=0;
float res=0.5;
cin>>n;
  cout<<"0.5"<<" ";
for(int i=1;i<n;i++){
  if(mul == 0){
  	res = res+1;
    mul=1;
  }else{
    mul = mul*3;
  	res=res+mul;
  }
  cout<<res<<" ";
}

}
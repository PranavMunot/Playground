#include<iostream>
using namespace std;

bool check(int m,int n,int val){
  int mul = 1;
	for(int i=0;i<n;i++){
    	mul = mul*m;
    }
  //cout<<mul<<endl;
  if(mul >= val){
  	return true;
  }
  else{
  	return false;
  }
}

int main(){
	int m,n,val;
  	cin>>m>>n>>val;
  	if(check(m,n,val)){
    	cout<<"Doctor, you can proceed with your experiment."<<endl;
    }
  	else{
    	cout<<"Sorry Doctor! You need more bacteria."<<endl;
    }
}
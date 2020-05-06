#include<iostream>
using namespace std;
int main(){
	int ip,out;
  	cin>>ip;
  	for(int i=1;i<=ip;i++){
      if(ip%i==0){
		out +=1;
      }
    }
  if(out==2){
  	cout<<"Eligible"<<endl;
  }
  else{
  cout<<"Not eligible"<<endl;
  }
  
}
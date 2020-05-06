#include<iostream>
using namespace std;

int main(){
	int a,b;
  cin>>a;
  cin>>b;
  if(a>b){
  cout<<"Yes, you can enter."<<endl;
  }
  else if(a==b){
  cout<<"Yes, you can enter. Kindly use a rope."<<endl;
  }
  else{
  cout<<"Sorry, you can't enter"<<endl;
  }
}
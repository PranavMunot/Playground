#include<iostream>
using namespace std;
int main(){
  int in,out = 1;
  cin>>in;
  for(int i=1;i<=in;i++){
  	out = out*i;
  }
  cout<<out<<endl;
}
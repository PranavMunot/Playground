#include<iostream>
using namespace std;
int main()
{
  int ip,out=0;
  cin>>ip;
  for (int i=1;i<=ip;i++){
  	for(int j=i;j<ip;j++){
    	out += 1;
     // cout<<out<<endl;
    }
  }
  cout<<out<<endl;
}
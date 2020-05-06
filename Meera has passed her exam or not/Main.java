#include<iostream>
using namespace std;
int main()
{
  int ip,res;
  int check=-1;
  cin>>ip;
  int a[ip];
  for(int i=0;i<ip;i++){
  	cin>>a[i];
  }
  cin>>res;
  for(int i=0;i<ip;i++){
  	if(res==a[i]){
    check++;
    }
    
  }
  if(check!=-1){
  cout<<"She passed her exam"<<endl;
  }
 
  else{
  cout<<"She failed"<<endl;
  }
}
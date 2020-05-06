#include<iostream>
using namespace std;
int main()
{
  int age; 
   float p,t;
  cin>>age>>t;
  bool mat;
  if(t>11.00){
    mat=true;
  }
  else{
    mat=false;
  }
  //cout<<mat<<endl;
  if(mat){
  	if(age>=13){
    	p=5.00;
    }
    else{
    	p=2.00;
    }
  }
  else{
  	if(age>=13){
    	p=8.00;
    }
    else{
    	p=4.00;
    }
  }
  
  cout<<"$"<<p<<".00"<<endl;
    
}
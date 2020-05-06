#include<iostream>
using namespace std;
int main()
{
  int items;
  float hT;
  double test;
  cin>>items>>hT;
  
  //half inc at 2 && dbl at 3 
  if(items<=2){
  	test = hT+ (hT*0.5);
    cout<<test<<endl;
  }
  else if(items==3){
  	test = hT*2;
    cout<<test<<endl;
  }
  else{
  	cout<<"Number of items is more"<<endl;
  }
}
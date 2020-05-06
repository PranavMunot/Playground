#include<iostream>
using namespace std;
int main()
{
  int units,result,extra;
  float cost;
  cin>>units;
  if(units<=200){
  cost=0.5;
    extra=0;
  }
  else if(units>201&&units<=400){
  	cost=0.65;
    extra=100;
  }
  else if(units>401&&units<=600){
  	cost=0.80;
    extra=200;
  }
  else{
  	cost=1.25;
    extra=425;
  }
  result = (cost*units)+extra;
  cout<<"Rs."<<result<<endl;
}
#include<iostream>
using namespace std;
int main()
{
  int mugs,tot_vol;
  cin>>mugs>>tot_vol;
  int mugs_vol[mugs];
  for(int i=0;i<mugs;i++){
  	cin>>mugs_vol[i];
  }
  int sum=0;
  for(int i=0;i<mugs;i++){
  	sum = sum + mugs_vol[i];
  }
  if(sum>tot_vol){
  cout<<"NO"<<endl;
  }
  else{
  cout<<"YES"<<endl;
  }
}
#include<iostream>
using namespace std;

int mul(int x,int ip){
	if(x==0){
    	return 1;
    }
  	return (ip*mul(x-1,ip));
}

int main()
{
  int n,m,res;
  cout<<"Enter the value of a"<<endl;
  cin>>n;
  cout<<"Enter the value of n"<<endl;
  cin>>m;
    
    int ans = mul(m,n);
  //cout<<ans;
    
    
  cout<<"The value of "<<n<<" power "<<m<<" is "<<ans<<endl;
}
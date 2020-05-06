#include<iostream>
using namespace std;
int main()
{
	int a,b,x;
  	cin>>a>>b;
  if(a>b){
    //convert b
     x =100-a;
    x += b;
    cout<<x<<endl;
  }
  else{
  	x=b-a;
    cout<<x<<endl;
  }
}
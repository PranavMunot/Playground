#include<iostream>
using namespace std;

bool data(int n){
  	int even=0,odd=0,digit;
	for(n;n>0;n=n/10){
    	digit = n%10;
      	if(digit%2==0){
       		even = even+digit;
        }
      	else{
        	odd = odd + digit;
        }
    }
  if(even==odd){
  	return true;
  }
  else{
  	return false;
  }
}

int main()
{
  int n;
  cin>>n;
  if (data(n)){
  cout<<"Yes"<<endl;
  }
  else{
  cout<<"No"<<endl;
  }
}
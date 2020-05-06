#include <iostream>
using namespace std;
int main() 
{
	int in,process,out,n;
  	cin>>in;
  	while(in>0){
    	out = in % 10;
      	cout<<out;
      	in = in/10;
    }
	return 0;
}
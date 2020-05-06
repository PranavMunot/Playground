#include<iostream>
using namespace std;
int sum=0;
int digi(int n){
	if(n<=9){
    	sum = sum+n;
      	return sum;
    }
  	digi(n/10);
  	n=n%10;
  	sum=sum+n;
  	return sum;
}

int main(){
	int n;
  	cin>>n;
  	int out,out2;
  out=digi(n);
  sum=0;
  out2 = digi(out);
  cout<<out2<<endl;
  /*	while(1){
        out = digi(n);
    	if(out>=10){
        	//call function again
          	cout<<out<<endl;
          	out2 = digi(out);
          cout<<out2<<endl;
         break;
        }
      	else{
        	//print output
          
          
          	break;
        }
    }*/
}
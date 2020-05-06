#include<iostream>
using namespace std;
int main()
{
	int total,score,sum=0,count=0;
  	cin>>total;
  while(1){
  	cin>>score;
    sum = sum+score;
    if(sum>=total){
    	count++;
      	break;
    }
    else{
    	count++;
    }
  }
  cout<<"The number of turns is "<<count<<endl;
}
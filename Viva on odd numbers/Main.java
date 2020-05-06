#include<iostream>
using namespace std;
int main()
{
  int n,count=0,neg=0;
  float score=0;
  while(1){
  cin>>n;
    if(count==3||neg==1){
    	break;
    }
    else{
    	if(n<0){
        	score--;
          neg =1;
        }
      else if(n%2==0){
      	score = score - 0.5;
      }
      else{
       score++;
        count++;
      }
    }
  }
  cout<<score;
}
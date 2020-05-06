#include<iostream>
using namespace std;

int main()
{
  char str[10];
  int door=-1;
  cin.getline(str,10);
  if(str[0]=='f'||str[0]=='F'){
  	cin>>door;
    if(door==1){
    	cout<<"Left Handed"<<endl;
    }
    else{
    	cout<<"Right Handed"<<endl;
    }
  }
  else{
  	cin>>door;
    if(door==1){
    	cout<<"Right Handed"<<endl;
    }
    else{
    	cout<<"Left Handed"<<endl;
    }
  }
}
#include<iostream>
#include<string>
using namespace std;
int main()
{
  	string S1,S2,S3;
  	getline(cin,S1);
  	getline(cin,S2);
  	for(auto i = S2.crbegin();i<S2.crend();i++){
    	S3.push_back(*i);
    }
  	if(S1==S3){
    
cout<<"It is correct"<<endl;    }
  else{
  	
cout<<"It is wrong"<<endl;
  }
}
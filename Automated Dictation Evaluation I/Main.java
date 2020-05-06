#include<iostream>
#include<string>
using namespace std;
int main()
{
  	string S1,S2;
  	getline(cin,S1);
  	getline(cin,S2);
  	if(S1==S2){
    cout<<"It is correct"<<endl;
    }else{
    cout<<"It is wrong"<<endl;
    }
}
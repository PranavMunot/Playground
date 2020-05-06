#include<iostream>
#include<string>
using namespace std;
int main()
{
  	string S1,S2;
  getline(cin,S1);
  int x=S1[S1.length()-1];
  cout<<S1<<endl;
  while(1){
 
        getline(cin,S2);
        int z=S2[0];
    
    if(x==z){
        cout<<S2<<endl;
        x=S2[S2.length()-1];
    }    
    else{
        break;
    }
      
  }
  
}
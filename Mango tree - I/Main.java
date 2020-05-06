#include<iostream>
using namespace std;
int main()
{
  int m,n,pos;
  cin>>m>>n>>pos;

    if(pos<=n){
      
    	cout<<"Yes"<<endl;
      
    }
     else if(pos%n==0||pos%n==1){
      cout<<"Yes"<<endl;
      }
      else{
       cout<<"No"<<endl;
      }
    
}
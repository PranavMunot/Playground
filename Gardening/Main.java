#include<iostream>
using namespace std;
int main()
{
  int r,c,check = 0,no=0;
  cin>>r>>c;
  int one[r][c];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	one[i][j]=++no;
    }
  }
  

  int val;
  cin>>val;
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	if(val == one[i][j]){
      
          if(i == r-2||i == 1){
              check = 1;
          }
          
        }
    }
  }
 
  if(check == 1){
  cout<<"It is a mango tree"<<endl;
  }
  else{
  	cout<<"It is not a mango tree"<<endl;
  }
  
}
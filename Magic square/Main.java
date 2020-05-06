#include<iostream>
using namespace std;
int main()
{
  int r,c,n,solve=0,sum=0;
  cin>>n;
  r=n;c=n;
  int a[n][n];
  int sum_check=((n*(n*n+1))/2);
  //cout<<sum_check<<endl;
  for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
    	cin>>a[i][j];
    }  
  }
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	sum=sum+a[i][j];
    }
    if(sum==sum_check){
    	sum=0;
      solve=1;
      	continue;
    }
    else{
      	solve=0;
    	break;
    }
  }
  if(solve==0){
  	cout<<"No"<<endl;
  }
  else{
  	cout<<"Yes"<<endl;
  }
  
}
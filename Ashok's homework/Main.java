#include<iostream>
using namespace std;
int main()
{
   int r,c;
  	cin>>r>>c;
  int a[r][c],b[r][c],x[r][c];
  for(int i=0;i<r;i++){
  	for(int j =0;j<c;j++){
    	cin>>a[i][j];
    }
  }
  for(int i=0;i<r;i++){
  	for(int j =0;j<c;j++){
    	cin>>b[i][j];
    }
  }
  for(int i=0;i<r;i++){
  	for(int j =0;j<c;j++){
    	x[i][j] = a[i][j] + b[i][j];
    }
  }
  for(int i=0;i<r;i++){
  	for(int j =0;j<c;j++){
    	cout<<x[i][j]<<" ";
    }
    cout<<'\n';
  }
}
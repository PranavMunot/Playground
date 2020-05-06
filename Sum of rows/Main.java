#include<iostream>
using namespace std;
int main()
{
	int r,c,high=0;
  	cin>>r>>c;
  	int a[r][c],sum[r];
  	for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
         	cin>>a[i][j]; 
        }
    }
  	high=0;
  	for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++){
         	high = high+a[i][j];
        }
      sum[i]=high;
      high=0;
    }
  for(int i=0;i<r;i++){
  	cout<<sum[i]<<endl;
  }
}
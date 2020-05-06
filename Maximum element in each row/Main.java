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
  	
  	for(int i=0;i<r;i++){
      high=a[i][0];
    	for(int j=0;j<c;j++){
         	if(high<a[i][j]){
            	high=a[i][j];
            }
        }
      sum[i]=high;
    }
  for(int i=0;i<r;i++){
  	cout<<sum[i]<<endl;
  }
}
#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	cin>>a[i][j];
    }
  }
  int high=a[0][0];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	if(high<a[i][j]){
        	high = a[i][j];
        }
    }
  }
  cout<<"The maximum element is "<<high<<endl;
}
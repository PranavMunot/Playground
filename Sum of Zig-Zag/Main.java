#include<iostream>
using namespace std;
int main()
{
  int r,c,dig=0,row=0,row_n;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++){	
  	for(int j=0;j<c;j++){
    	cin>>a[i][j];
    }
  }
  	for(int i=0;i<r;i++){	
      for(int j=0;j<c;j++){
          if((i+j)==(r-1)){
          	dig= dig+a[i][j];
          }
        	if(i==0||i==r-1){
            row=row+a[i][j];
            }
      }
  	}
  cout<<"Sum of Zig-Zag pattern is "<<(dig+row)-a[0][c-1]-a[r-1][0]<<endl;
}
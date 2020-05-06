#include<iostream>
using namespace std;
int main()
{
  int r,c,sum=0,row=1,col=1;
  cin>>r>>c;
	int a[r][c],sum_r[r],sum_c[c];
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	cin>>a[i][j];
    }
  }
  //row wise series
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	sum = sum + a[i][j];
    }
    sum_r[i]=sum;
    sum=0;
  }
  //col wise series
  for(int i=0;i<r;i++){
  	for(int j=0;j<c;j++){
    	sum = sum + a[j][i];
    }
    sum_c[i]=sum;
    sum=0;
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++){
  	cout<<sum_r[i]<<" ";
  }
  cout<<endl;
  
  int high=sum_r[0];
  for(int i=0;i<r;i++){
  	if(high<sum_r[i]){
    	high = sum_r[i];
      	row=i+1;
    }
  }
  cout<<"Row "<<row<<" has maximum sum"<<endl;
  
  
   cout<<"Sum of columns is ";
  for(int i=0;i<c;i++){
  	cout<<sum_c[i]<<" ";
  }
  cout<<endl;
  
 high=sum_c[0];
  for(int i=0;i<c;i++){
  	if(high<sum_c[i]){
    	high = sum_c[i];
      	col=i+1;
    }
  }
  cout<<"Column "<<col<<" has maximum sum"<<endl;
  
}
#include<iostream>
#include<cstdlib>

using namespace std;

int main(){
  int n,male=0,female=0;
  cin>>n;
 int *p = (int*)calloc(n,sizeof(int));
  for(int i=0;i<n;i++){
  	cin>>*(p+i);
  }
  for(int i=0;i<n;i++){
  	if((*(p+i))%2==0){
    	female++;
    }
    else{
    	male++;
    }
  }
  cout<<male<<endl;
  cout<<female<<endl;
  free(p);
  return 0;
}
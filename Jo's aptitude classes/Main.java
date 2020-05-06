#include<iostream>
using namespace std;

int smaller(int a,int b,int c){
	if(a<=b&&a<=c){
    	return a;
    }else if(b<=a&&b<=c){
    	return b;
    }else{
    	return c;
    }
}

int hcf(int a,int b,int c){
int small=smaller(a,b,c);
  int hcf=1;
  for(int i=1;i<=small;i++){
    	if(a%i==0&&b%i==0&&c%i==0){
        	hcf=i;
        }
    }
  return hcf;
}

int main(){
	int a,b,c,ans;
  	cin>>a>>b>>c>>ans;
  	int x = hcf(a,b,c);
  
  /*
  cout<<small<<" "<<ans<<endl;*/
  	if(x==ans){
    cout<<"Answer is correct."<<endl;
    }
  else{
  	cout<<"Answer is wrong."<<endl;
  }
}
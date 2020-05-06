#include<iostream>
using namespace std;

int hcf(int n1,int n2,int shor){
	if(n1%shor == 0 && n2%shor == 0){
    	return shor;
    }
      return hcf(n1,n2,shor-1);
}

int main()
{
  int n,m;
  cin>>n>>m;
  int shor;
  if(n>m){
  shor= m;
  }
  else{
  	shor = n;
  }
 int ans = hcf(n,m,shor);
  cout<<"G.C.D of "<<n<<" and "<<m<<" = "<<ans<<endl;
}
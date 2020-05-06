#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 //a,b,c,d
  /* 
  c/d=current
  b/a=req
  */
  int a,b,c,d,out;
  double over;
  double cur=0,req=0,elapsed_over=0;
  cin>>a>>b>>c>>d;
  float x =float(a/6);
  req = float(b/x);
  over = float(a/6);
  elapsed_over = float(d/6) + float(d%6*0.1);
  cur = float(c/elapsed_over);
  
  cout<<over<<endl;
  cout<<elapsed_over<<endl;
  cout<<fixed<<setprecision(1)<<cur<<endl;
  cout<<req<<endl;
  
  if(cur>=req){
  cout<<"Eligible to Win"<<endl;
  }
  else{
  cout<<"Not Eligible to Win"<<endl;
  }
}
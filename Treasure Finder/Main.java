#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,m;
  cin>>a>>b>>c;
  int res;
  if(a>=b && a>=c)
  {
  m=a;
    if(b >= c)
        {
       cout<<"The treasure is in box which has number "<<b;
         }
        else
        {
         cout<<"The treasure is in box which has number "<<c;
        }
  }//if
  else if(b >= a && b >= c)
  { m=b;
  if(a >= c)
        {
             cout<<"The treasure is in box which has number "<<a;
       
        }
        else
        {
         cout<<"The treasure is in box which has number "<<c;
           
        }
  }//else
  else if(a>=b)
  {
    m=c;
               cout<<"The treasure is in box which has number "<<a;

  }
  else{
    m=c;
  cout<<"The treasure is in box which has number "<<b;
  }

  for(int i=m;m>=1;m--)
  {
  if(a%m==0 && b%m==0 && c%m==0)
  {
  res=m;
    break;
  }//if
  }//for
  cout<<"\n";
cout<<"The code to open the box is "<<res;
}//main




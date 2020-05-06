#include <iostream>
using namespace std;
int main()
{
 	int n;
  cin>>n;
  int x=1;
  for(int i=0;i<n;i++)
  {
  		if(i%2==0)
        {
        		for(int j=1;j<n;j++)
                {
                cout<<x;
                }
          		cout<<++x<<endl;
        }//if
    else
    {
    		cout<<(x+1);
      for(int j=1;j<n;j++)
      {
      		cout<<x;
      }//for
      cout<<endl;
      x++;
    }//else
  }//for
  
  
      return 0;
}
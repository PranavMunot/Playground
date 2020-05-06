#include<iostream>
using namespace std;
int main()
{
  int n,find,val;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n+1];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++){
  	cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>find;
  find=find-1;
  if(n<find){
  	cout<<"Invalid Input"<<endl;
  }
  else{
    cout<<"Enter the value to insert"<<endl;
    cin>>val;
    for(int i=n;i>=find;i--){
      a[i+1]=a[i];
    }
    a[find]=val;

    cout<<"Array after insertion is"<<endl;
    for(int i=0;i<=n;i++){
      cout<<a[i]<<endl;
    }
  }
}
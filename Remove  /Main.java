#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  string str;
  getline(cin,str);
  
  int found=str.find("the");
  str.erase(found,4);
  
  found=str.find("the",found+1,1);
  
  str.erase(found,4);
  
  cout<<str;
}
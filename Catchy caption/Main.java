#include <cstring>
#include <iostream>

using namespace std;

int main()
{
   char str[1000];
  cin.getline(str,1000);
  if(strlen(str)>70){
  	cout<<"Caption not eligible for the contest";
  }
  else{
  	cout<<"Caption eligible for the contest";
  }
   
}
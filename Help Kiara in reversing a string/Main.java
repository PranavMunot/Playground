#include <iostream>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i;  
  //cin>>str;
  cin.getline(str,100);
for(int j=0;str[j]!='\0';j++){
	count++;
}
  i=count-1;
  /*while(i>=0){
  	cout<<str[i];
    i--;
  }*/
 for(int j = i;j>=0;j--){
  	cout<<str[j];
  }

}
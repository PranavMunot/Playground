#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char str[200];
  cin.getline(str,200);
  int v,c,ws,dg,sym;
  v=c=ws=dg=sym=0;

  for(int i=0;i<strlen(str);i++)
  {
  	if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U' )
    {v++;}
    else if((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z'))
    {c++;}
    else if(str[i]==' ')
    {ws++;}  
    else if(str[i]>='0' && str[i]<='9')
    {dg++;}
    else {sym++;}
    
    
    
  }//for
  
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<ws<<"\nDigits:"<<dg<<"\nSymbols:"<<sym;
  
}
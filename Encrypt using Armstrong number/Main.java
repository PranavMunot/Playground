#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int i=0,digit;
  	i=n;
  	int j=n;
  	int calc = 0,count = 0;
  
  	while(i>0){
    	digit= i%10;
      	count++;
      	i=i/10;
    }
  	
  	while(j>0){
    	digit= j%10;
      	calc = calc + power(digit,count);
      	j=j/10;
    }
  
  	if (calc==n)
      return 1;
  	else
      return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}
//Fibonacci Series using Recursion 
#include<bits/stdc++.h> 
using namespace std; 
  
int f[100];
int fib(int n) 
{ 
  /* Declare an array to store Fibonacci numbers. */
  int f[n+2];   // 1 extra to handle case, n = 0 
  int i; 
  
  /* 0th and 1st number of the series are 0 and 1*/
  f[0] = 0; 
  f[1] = 1; 
  
  for (i = 2; i < n; i++) 
  { 
      f[i] = f[i-1] + f[i-2]; 
  } 
  
  return f[n-1]; 
} 
  
  
int main () 
{ 
    int n;
  cin>>n;
 // cout<<fib(n);
 cout<<"The term "<<n<<" in the fibonacci series is "<< fib(n);
   
    return 0; 
} 
#include<iostream>
using namespace std;

int main(){

int j,k=0,n;
cin>>n;
int count = 1;
    for (int i=1; i<=n; i++) 
    { 
        // if row number is odd 
        if (i%2 != 0) 
        { 
            // print numbers with the '*' sign in  
            // increasing order 
            for (j=k+1; j<k+i; j++) 
                cout << j << "*"; 
            cout << j++ << endl; 
              
            // update value of 'k'     
            k = j;     
        } 
          
        // if row number is even 
        else
        { 
            // update value of 'k' 
            k = k+i-1; 
              
            // print numbers with the '*' in  
            // decreasing order 
            for (j=k; j>k-i+1; j--) 
                cout << j << "*"; 
            cout << j << endl;     
        } 
    } 
}
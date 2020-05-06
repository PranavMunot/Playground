#include<iostream>
using namespace std;

int shop(int a,int b, int c);

int main()
{
	int p,d,s;
  	cin>>p>>d>>s;
  	int flip = shop(p,d,s); 
     cout<<"In Flipkart Rs."<<flip<<endl;
      cin>>p>>d>>s;
    int snap = shop(p,d,s); 
     cout<<"In Snapdeal Rs."<<snap<<endl;
      cin>>p>>d>>s;
    int amaz = shop(p,d,s); 
      cout<<"In Amazon Rs."<<amaz<<endl;
  	if(flip<snap&&flip<amaz){
    	cout<<"He will prefer Flipkart"<<endl;
    }
  else if(snap<flip&&snap<amaz){
  	cout<<"He will prefer Snapdeal"<<endl;
  }
  else if(amaz<flip&&amaz<snap){
    cout<<"He will prefer Amazon"<<endl;
  }
  else{
   	cout<<"He will prefer Flipkart"<<endl;
  }
  
}

int shop(int p,int d,int s){
	float disk = d*0.01;
  	int price = p - (p*disk);
	int sum= price+s;
  	return sum;
}
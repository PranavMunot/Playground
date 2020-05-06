#include<iostream>
using namespace std;
struct complex{
int a,b;
};

void comp_addition(complex,complex);
void comp_sub(complex,complex);
void comp_mul(complex,complex);

int main(){
complex c1,c2,total;
  int choice;
  cin>>choice;
  cin>>c1.a;
  cin>>c1.b;
  cin>>c2.a;
  cin>>c2.b;
 switch(choice){
  case 1:
      comp_addition(c1,c2);
      break;
  case 2:
      comp_sub(c1,c2);
      break;
  case 3:
      comp_mul(c1,c2);
      break;
  default:
      cout<<"Invalid choice"<<endl;
      break;
  }
}

void comp_addition(complex c1,complex c2){
int a = c1.a+c2.a;
  int b = c1.b+c2.b;
  if(b>=0){
  cout<<a<<"+"<<b<<"i"<<endl;
  }
  else{
  cout<<a<<b<<"i"<<endl;
  }
}

void comp_sub(complex c1,complex c2){
int a = c1.a-c2.a;
  int b = c1.b-c2.b;
  if(b>=0){
  cout<<a<<"+"<<b<<"i"<<endl;
  }
  else{
  cout<<a<<b<<"i"<<endl;
  }
}
void comp_mul(complex c1,complex c2){
int a = c1.a*c2.a+((-1)*(c1.b*c2.b));
  int b = (c1.a*c2.b)+(c1.b*c2.a);
  if(b>=0){
  cout<<a<<"+"<<b<<"i"<<endl;
  }
  else{
  cout<<a<<b<<"i"<<endl;
  }
 
}

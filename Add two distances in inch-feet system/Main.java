#include<iostream>
using namespace std;

struct dist
{
  int feet;
  float inch;
};


int main(){
dist d1,d2,total;
cin>>d1.feet>>d1.inch>>d2.feet>>d2.inch;
total.feet = d1.feet+d2.feet;
total.inch = d1.inch+d2.inch;
if(total.inch>12.0){
  total.inch=total.inch-12.0;
  ++total.feet;
}
cout<<total.feet<<"\'-"<<total.inch<<'"';

}
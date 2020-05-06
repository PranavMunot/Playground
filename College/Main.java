#include <iostream>
using namespace std;

struct student
{
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage;
};

int main() {
  int n;
  cin>>n;
  student s[n];
  cout<<"Enter the number of colleges"<<endl;
  for (int i = 0; i < n; i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>s[i].name;
    cout<<"Enter city"<<endl;
    cin>>s[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>s[i].establishmentYear;
    cout<<"Enter pass percentage"<<endl;
    cin>>s[i].passPercentage;
  }
  cout<<"Details of colleges"<<endl;
  for (int i = 0; i < n; i++)
  {
    cout<<"College:"<<i+1<<endl;
    cout<<"Name:";
    cout<<s[i].name<<endl;
    cout<<"City:";
    cout<<s[i].city<<endl;
    cout<<"Year of establishment:";
    cout<<s[i].establishmentYear<<endl;
    cout<<"Pass percentage:";
    cout<<s[i].passPercentage<<endl;
  }
}

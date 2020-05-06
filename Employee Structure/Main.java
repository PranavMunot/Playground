#include <iostream>
#include<iomanip>
using namespace std;

struct Emp
{
  char name[100];
  int id;
  int age;
  char designation[100];
  float salary;
};

int main() {
  int n=1;
  Emp s[n];
  for (int i = 0; i < n; i++)
  {
    
    cout<<"Enter name:"<<endl;
    cin>>s[i].name;
    cout<<"Enter ID:"<<endl;
    cin>>s[i].id;
    cout<<"Enter age:"<<endl;
    cin>>s[i].age;
    cout<<"Enter designation:"<<endl;
    cin>>s[i].designation;
    cout<<"Enter Salary:"<<endl;
    cin>>s[i].salary;
  }
  for (int i = 0; i < n; i++)
  {
    cout<<"Employee Details"<<endl;
    cout<<"Name of the Employee : ";
    cout<<s[i].name<<endl;
    cout<<"ID of the Employee : ";
    cout<<s[i].id<<endl;
    cout<<"Age of the Employee : ";
    cout<<s[i].age<<endl;
    cout<<"Designation of the Employee : ";
    cout<<s[i].designation<<endl;
    cout<<"Salary of the Employee : ";
    cout<<s[i].salary<<endl;
  }
}

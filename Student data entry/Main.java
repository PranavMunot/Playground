#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  cout<<endl;
  cout<<"Student Details"<<endl;
  student stud;
  cin.getline(stud.name,50);
  cout<<"Name: "<<stud.name<<endl;
  cin>>stud.roll;
  cout<<"Roll: "<<stud.roll<<endl;
  cin>>stud.marks;
  cout<<"Marks: "<<stud.marks;
  
}
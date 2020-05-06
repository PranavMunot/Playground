#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tue,wed,thu,fri,sat,salary,m,t,w,t1,f,a,s,s1,b;
  cin >> sun >> mon >> tue >> wed >> thu >> fri >> sat;
  
  a = mon + tue + wed + thu + fri;
  if(a >= 40)
    b = a*100 + (a - 40)*25;
  else
    b = a*100;
  
  if(mon > 8)
    m = (mon - 8)*15;
  else
    m = 0;
  
  if(tue > 8)
    t =(tue - 8)*15;
  else
    t = 0;

  if(wed > 8)
    w =(wed - 8)*15;
  else
    w = 0;

  if(thu > 8)
    t1 =(thu - 8)*15;
  else
    t1 = 0;

  if(fri > 8)
    f =(fri - 8)*15;
  else
    f = 0;
  
  if(sat != 0)
    s = sat * 125;
  else
    s = 0;

  if(sun != 0)
    s1 =sun * 150;
  else
    s1 = 0;
  
  salary = b + m + t + w + t1 + f + s + s1;
  cout << salary;
  

}
#include<iostream>
using namespace std;

int factorial(int n);

int main()
{
    int n,res;
    cin >> n;
	res = factorial(n);
    cout << "The factorial of " << n << " is " << res;

    return 0;
}

int factorial(int n)
{
    if(n > 1)
        return n * factorial(n - 1);
    else
        return 1;
}

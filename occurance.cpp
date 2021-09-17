/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/


#include <iostream>
using namespace std;
 
int main()
{
    int arr[] = { 9, 3, 15, 2, 8 };
    int n = sizeof(arr)/sizeof(arr[0]);
 
    int num;
    cin>>num;
 
    int i = 0;
    while (i < n)
    {
        if (arr[i] == num) {
            break;
        }
        i++;
    }
 
    if (i < n)
    {
        cout << "Element " << num << " is present at index " << i
             << " in the given array";
    }
    else {
        cout << "Element is not present in the given array";
    }
 
    return 0;
}

#include <iostream>

//Find the sum of all the multiples of 3 or 5 below 1000.

using namespace std;

int main()
{
    int total = 0;
    for (int i = 1; i < 1000; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
            total = total + i;
        }
    }
    cout << total << endl;
}

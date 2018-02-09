#include <iostream>
#include <math.h>

// What is the largest prime factor of the number 600851475143?

using namespace std;

int isPrime (int number) {
    for (int j = 2; j < number / 2; j++)
        if (number % j == 0) {
            return 0;
        }
    return 1;
}

int main () {
    double target = 600851475143;
    for (int i = 2; i <= target / 2; i++) {
        double k = target / i;
        if (ceilf(k) == k) {
            if (isPrime((int)k) == 1) {
                cout << fixed << "The highest prime factorial is " << (int)k << endl;
                break;
            }
        }
    }
}

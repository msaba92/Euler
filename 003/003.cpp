#include <math.h>
#include <iostream>

// What is the largest prime factor of the number 600851475143?

int isPrime(int number) {
    for (int j = 2; j < number / 2; j++)
        if (number % j == 0) {
            return 0;
        }
    return 1;
}

int main() {
    double target = 600851475143;
    for (int i = 2; i <= target / 2; i++) {
        double k = target / i;
        if (ceilf(k) == k) {
            if (isPrime(static_cast<int>(k)) == 1) {
                std::cout << std::fixed << "The highest prime factorial is " << static_cast<int>(k) << "." << std::endl;
                break;
            }
        }
    }
}

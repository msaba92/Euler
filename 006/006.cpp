#include <iostream>
#include <cmath>

// Find the difference between the sum of the squares of the
// first one hundred natural numbers and the square of the sum.

int difference() {
    int tsum = 0;
    int tdiff = 0;

    for (int x = 1; x <= 100; x++) {
        tsum += pow(x, 2);
        tdiff += x;
    }

    return tsum - pow(tdiff, 2);
}

int main() {
    std::cout << "The number in question is " << difference()
              << "." << std::endl;
}

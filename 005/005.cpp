#include <iostream>
#include <string>

// Find the largest palindrome made from the product of two 3-digit numbers.

using namespace std;

int Finder() {
    int step = 20;
    bool found = false;

    while (true) {
        for (int i = 11; i <= 20; i++) {
            if (step % i == 0) {
                found = true;
            } else {
                found = false;
                break;
            }
        }
        if (found) {
            return step;
        }
        step = step + 20;
    }
}

int main() {
    int number = Finder();
    cout << "The number in question is " << number << "." << endl;
}

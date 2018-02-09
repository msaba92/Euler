#include <iostream>
#include <string>

// Find the largest palindrome made from the product of two 3-digit numbers.

using namespace std;

bool isPalindrome (int k) {
    string r = to_string(k);
    int len = (int)r.length();
    for (int s = 0; s < len / 2; s++) {
        if (r[s] != r[len-(1+s)])
            return false;
    }
    return true;
}

int main() {
    int control = 0;
    for (int i = 999; i > 99; i--) {
        for (int j = 999; j > 99; j--) {
            int k = i * j;
            if (isPalindrome(k) == true) {
                if (k > control) {
                    control = k;
                }
            }
        }
    }
    cout << "The largest palindrome in question is " << control << endl;
}

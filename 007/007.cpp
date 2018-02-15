#include <iostream>
#include <vector>
#include <cmath>

// What is the 10 001st prime number?

using namespace std;

int findprime(){
    vector<int> knownprimes = {2};
    int i = 3;
    bool prime = false;

    while (knownprimes.size() < 10001) {
        for (unsigned int x = 0; x < knownprimes.size(); x++) {
            if (fmodf(i, knownprimes[x]) == 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        if (prime) {
            knownprimes.push_back(i);
        }
        i += 1;
    }
    return knownprimes.back();
}

int main(){
    int number = findprime();
    cout << "The number is " << number << "." << endl;
}

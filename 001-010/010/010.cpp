#include <iostream>
#include <math.h>
#include <vector>

int isPrime(int i, std::vector<int>& primes) {
    for (int x = 0; x < primes.size(); x++) {
        if (sqrt(i) >= primes[x]) {
            if (i % primes[x] == 0) {
                return 1;
            }
        } else {
            return 0;
        }
    }
    return 0;
}


int main() {
    long long total = 2;
    std::vector<int> primes = {2};
    for (int i = 3; i < 2000000; i += 2) {
        if (isPrime(i, primes) == 0) {
            primes.push_back(i);
            total += i;
        }
    }
    std::cout << total << std::endl;
}

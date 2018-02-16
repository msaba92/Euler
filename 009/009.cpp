#include <iostream>
#include <cmath>

int main() {
    for (int a = 2; a < 1001; a++) {
        for (int b = 3; b < 1001; b++) {
            for (int c = 4; c < 1001; c++) {
                if (a + b + c == 1000) {
                    if (pow(a, 2) + pow(b, 2) == pow(c, 2)) {
                        std::cout << a << ", " << b << ", " << c
                                   << ", " << a*b*c << std::endl;
                        return 0;
                    }
                } else if (a + b + c > 1000) {
                    break;
                }
            }
        }
    }
}

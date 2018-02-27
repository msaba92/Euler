#include <iostream>
#include <fstream>
#include <sstream>

double calc() {

    double total = 0;
    std::ifstream file("numbers");
    double line;
    while (file >> line) {
        total += line;
    }
    return total;
}

int main() {
    double total = calc();
    std::ostringstream totalstr;
    totalstr << std::fixed << total;
    std::string printable = totalstr.str();
    std::cout << printable.substr(0, 10) << std::endl;
}

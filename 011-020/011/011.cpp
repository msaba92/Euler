#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>

int main() {

    std::vector<std::vector<int> > grid;

    std::ifstream readfile;
    std::string fileline;

    readfile.open("grid");
    while (!readfile.eof()) {

        for (int n = 0; n < 20; n++) {

            getline(readfile, fileline);
            std::stringstream ss(fileline);
            int temp;
            std::vector<int> line;

            while (ss >> temp)
                line.push_back(temp);
            grid.push_back(line);
        }
    }
    long long target = 0;

    for (int row = 0; row < grid.size(); row++) {
        for (int column = 0; column < grid[row].size(); column++) {
            std::vector<long long> total(4, grid[row][column]);

            for (int x = 1; x < 4; x++) {
                // to avoid some nasty and obscure segfaults we switch to .at()
                try {
                    total[0] *= grid.at(row + x).at(column);
                } catch (const std::out_of_range& e) {
                    total[0] = 1;
                }

                try {
                    total[1] *= grid.at(row).at(column + x);
                } catch (const std::out_of_range& e) {
                    total[1] = 1;
                }

                try {
                    total[2] *= grid.at(row + x).at(column + x);
                } catch (const std::out_of_range& e) {
                    total[2] = 1;
                }

                try {
                    total[3] *= grid.at(row - x).at(column + x);
                } catch (const std::out_of_range& e) {
                    total[3] = 1;
                }
            }
            for (int y = 0; y < total.size(); y++) {
                if (total[y] > target) {
                    target = total[y];
                }
            }
        }
    }
    std::cout << target << std::endl;
}

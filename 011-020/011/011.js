#!/usr/bin/env node

function readfile(filename) {
    var fs = require("fs");
    var contents = fs.readFileSync(filename);
    return contents;
}

(function main(){
    var data = readfile("grid");
    var lines = data.toString().split("\n");
    var grid = [];

    for (var x = 0; x < 20; x++) {
        grid.push(lines[x].split(" "));
    }

    var biggest = 0;

    for (var row = 0; row < grid.length; row++) {
        for (var column = 0; column < grid[row].length; column++) {
            var mynumber = parseInt(grid[row][column]);
            var total = [mynumber, mynumber, mynumber, mynumber];
            for (var y = 1; y < 4; y++) {
                try {
                    total[0] = total[0] * parseInt(grid[row + y][column]);
                } catch (err) {
                    total[0] = 1;
                }
                try {
                    total[1] *= parseInt(grid[row][column + y]);
                } catch (err) {
                    total[1] = 1;
                }
                try {
                    total[2] *= parseInt(grid[row + y][column + y]);
                } catch (err) {
                    total[2] = 1;
                }
                try {
                    total[3] *= parseInt(grid[row - y][column + y]);
                } catch (err) {
                    total[3] = 1;
                }
            }
            for (var z = 0; z < 4; z++) {
                if (total[z] > biggest) {
                    biggest = total[z];
                }
            }
        }
    }
    console.log(biggest);
})();

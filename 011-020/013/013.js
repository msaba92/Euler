#!/usr/bin/env node

function readfile(filename) {
    var fs = require("fs");
    var contents = fs.readFileSync(filename);
    return contents;
}

(function main(){
    var data = readfile("numbers");
    var lines = data.toString().split("\n");

    var total = 0;
    for (var x = 0; x < lines.length - 1; x++) {
        total += parseInt(lines[x]);
    }
    console.log(total.toString().split(".").join("").substr(0, 10));
})();

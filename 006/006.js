#!/usr/bin/env node

// Find the difference between the sum of the squares of the
// first one hundred natural numbers and the square of the sum.

function difference() {
    var tsum = 0;
    var tdiff = 0;

    for (var x = 1; x <= 100; x++) {
        tsum += Math.pow(x, 2);
        tdiff += x;
    }

    return tsum - Math.pow(tdiff, 2);
}

console.log("The number in question is " + difference() + ".");

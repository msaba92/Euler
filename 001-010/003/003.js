#!/usr/bin/env node

// What is the largest prime factor of the number 600851475143?

const target = 600851475143;

function isPrime (k) {
    for (var j = 2; j < k / 2; j++) {
        if (k % j === 0) {
            return 0;
        }
    }
    return 1;
}

for (var i = 2; i <= target/2; i++) {
    var k = parseFloat(target) / i;
    if (k % 1 === 0) {
        if (isPrime(k) == 1) {
            console.log("The highest prime factorial is %d", k);
            break;
        }
    }
}

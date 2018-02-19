#!/usr/bin/env node

function isPrime (i, primes) {
    for (var x = 0; x < primes.length; x++) {
        if (Math.sqrt(i) >= primes[x]) {
            if (i % primes[x] === 0) {
                return 1;
            }
        } else {
            return 0;
        }
    }
    return 1;
}

var total = 2;
var primes = [2];
for (var i = 3; i < 2000000; i += 2) {
    if (isPrime(i, primes) === 0) {
        primes.push(i);
        total += i;
    }
}

console.log(total);

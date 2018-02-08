// By considering the terms in the Fibonacci sequence whose values
// do not exceed four million, find the sum of the even-valued terms.

var i = 1;
var j, total = 0;
for (var k = 0; k < 4000000; k = i+j) {
    j = i;
    i = k;
    if (k % 2 == 0) {
        total += k;
    }
}
console.log(total);

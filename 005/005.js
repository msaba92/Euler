// Find the largest palindrome made from the product of two 3-digit numbers.

function finder() {
    var step = 20;
    var found = false;

    for (;;) {
        for (var i = 11; i <= 20; i++) {
            if (step % i == 0) {
                found = true;
            } else {
                found = false;
                break;
            }
        }
        if (found) {
            return step;
        }
        step = step + 20;
    }
}

const number = finder();
console.log("The number in question is %d.", number);

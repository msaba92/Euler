// What is the 10 001st prime number?

function findprime() {

    var i = 3;
    var prime = false;
    var knownprimes = [2];

    while (knownprimes.length < 10001) {
        for (var x = 0; x < knownprimes.length; x++) {
            if (i % knownprimes[x] === 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        if (prime) {
            knownprimes.push(i);
        }
        i += 1;
    }
    return knownprimes[knownprimes.length - 1];
}

(function main() {
    var number = findprime();
    console.log("The number in question is %d", number);
})();

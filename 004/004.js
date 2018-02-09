// Find the largest palindrome made from the product of two 3-digit numbers.

function isPalindrome (k) {
    var r = k.toString();
    for (var s = 0; s < r.length / 2; s++) {
        if (r[s] != r[r.length-(1+s)]) {
            return false;
        }
    }
    return true;
}

var control = 0;
for (var i = 999; i > 99; i--) {
    for (var j = 999; j > 99; j--) {
        var  k = i * j;
        if (isPalindrome(k) == true) {
            if (k > control) {
                control = k;
            }
        }
    }
}

console.log("The largest palindrome in question is " + control);

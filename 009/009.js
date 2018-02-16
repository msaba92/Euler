#!/usr/bin/env node

(function Finder() {
    for (var a = 2; a < 1001; a++) {
        for (var b = 3; b < 1001; b++) {
            for (var c = 4; c < 1001; c++) {
                if (a + b + c == 1000) {
                    if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                        console.log(a + ", " + b + ", " + c + ", " + a * b * c);
                        return;
                    }
                } else if (a + b + c > 1000) {
                    break;
                }
            }
        }
    }
})();

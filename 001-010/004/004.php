<?php

function isPalindrome($k) {
    for ($s = 0; $s < strlen($k) / 2; $s++) {
        if (substr($k, $s, 1) != substr($k, -(1+$s), 1)) {
            return False;
        }
    }
    return True;
}



$max = 0;
for($i = 999; $i > 99; $i--) {
    for($j = 999; $j > 99; $j--) {
        $k = $i * $j;
        if (isPalindrome($k) == True) {
            if ($k > $max) {
                $max = $k;
            }
        }
    }
}

echo "The largest palindrome in question is " . $max . ".\n"

?>

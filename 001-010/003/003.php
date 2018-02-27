<?php

$target = 600851475143;

function isPrime($number) {
    for($j = 2; $j < sqrt($number); $j++) {
        if (fmod($number, $j) == 0) {
            return 1;
        }
    }
    return 0;
}

for($i = 1; $i < $target / 2; $i += 2) {
    $k = $target / $i;
    if (fmod($k, 1) == 0) {
        if (isPrime($k) == 0) {
            echo "The highest prime factorial is " . $k . ".\n";
            break;
        }
    }
}

?>

<?php

function Difference() {
    $tsum = 0;
    $tdiff = 0;

    for($x = 1; $x < 101; $x++) {
        $tsum += $x**2;
        $tdiff += $x;
    }

    return $tsum - $tdiff**2;
}

echo Difference() . "\n"

?>

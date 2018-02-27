<?php

$total = 0;

foreach(range(1, 1000) as $num) {
    if (($num % 3 == 0) || ($num % 5 == 0)) {
        $total += $num;
    }
}

echo $total . "\n";

?>

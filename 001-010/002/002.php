<?php

$i = 1;
$j = 0;
$k = 0;
$total = 0;

while ($k < 4000000) {
    $k = $i + $j;
    $j = $i;
    $i = $k;
    if ($k % 2 == 0) {
        $total += $k;
    }
}
echo $total . "\n";

?>

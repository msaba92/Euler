<?php

function finder() {
    $found = False;
    $step = 20;
    while (true) {
        # If n % k == 0 then obviously n % (any factor of k) == 0,
        # so we can skip half the steps in this range
        for($i = 11; $i <21; $i ++) {
            if ($step % $i == 0) {
                $found = True;
            } else {
                $found = False;
                break;
            }
        }
        if ($found == True) {
            return $step;
        }
        $step += 20;
    }
}
echo finder() . "\n"

?>

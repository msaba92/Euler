#!/usr/local/bin/ruby -w

# By considering the terms in the Fibonacci sequence whose values
# do not exceed four million, find the sum of the even-valued terms.

def main
    i = 1
    j = 0
    k = 0
    total = 0

    while k < 4000000
        j = i
        i = k
        if k % 2 == 0
            total += k
        end
        k = i + j
    end

    puts total
end

main

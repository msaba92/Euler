#!/usr/local/bin/ruby -w

# By considering the terms in the Fibonacci sequence whose values
# do not exceed four million, find the sum of the even-valued terms.

def main
    i = 1
    k = 0
    total = 0

    while k < 4_000_000
        j = i
        i = k
        total += k if (k % 2).zero?
        k = i + j
    end

    puts total
end

main

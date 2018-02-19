#!/usr/local/bin/ruby -w

# Find the sum of all the multiples of 3 or 5 below 1000.

def main
    total = 0
    (1..999).each do |n|
        total += n if (n % 3).zero? || (n % 5).zero?
    end
    puts total
end

main

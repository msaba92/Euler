#!/usr/local/bin/ruby -w

# Find the difference between the sum of the squares of the
# first one hundred natural numbers and the square of the sum.

def difference
    tsum = 0
    tdiff = 0

    (1..100).each do |x|
        tsum += x**2
        tdiff += x
    end

    return tsum - tdiff**2
end

puts "The number in question is #{difference}."

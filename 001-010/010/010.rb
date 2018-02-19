#!/usr/local/bin/ruby -w

def prime?(number, primes)
    primes.each do |prime|
        if number**0.5 >= prime
            return 1 if (number % prime).zero?
        else
            return 0
        end
    end
end


total = 2
primes = [2]
(3..2_000_000).step(2).each do |x|
    if prime?(x, primes).zero?
        primes.push(x)
        total += x
    end
end

puts total

#!/usr/local/bin/ruby -w

# What is the largest prime factor of the number 600851475143?

target = 600851475143


def isPrime(number)
    (2..number.to_i/2).each do |j|
        if number % j == 0
            return 0
        end
    end
    return 1
end


(2..target/2).each do |i|
    k = target.to_f / i
    if k % 1 == 0
        if isPrime(k) == 1
            puts("The highest prime factorial is #{k.to_i}.")
            break
        end
    end
end

#!/usr/local/bin/ruby -w

# What is the largest prime factor of the number 600851475143?

target = 600_851_475_143

def prime?(number)
    (2..number.to_i / 2).each do |j|
        return 0 if (number % j).zero?
    end
    return 1
end

(2..target / 2).each do |i|
    k = target.to_f / i
    if (k % 1).zero?
        if prime?(k) == 1
            puts("The highest prime factorial is #{k.to_i}.")
            break
        end
    end
end

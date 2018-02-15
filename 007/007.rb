#!/usr/local/bin/ruby -w

# What is the 10 001st prime number?


def findprime()
    knownprimes = [2]
    i = 3
    prime = false

    while knownprimes.length < 10001
        knownprimes.each do |x|
            if i % x == 0
                prime = false
                break
            else
                prime = true
            end
        end
        if prime
            knownprimes.append(i)
        end
        i += 1
    end
    return knownprimes[-1]
end

puts "The number is #{findprime()}."

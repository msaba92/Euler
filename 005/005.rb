#!/usr/local/bin/ruby -w

# What is the smallest positive number that is
# evenly divisible by all of the numbers from 1 to 20?

def finder()
    found = false
    step = 20
    while true
        # If n % k == 0 then obviously n % (any factor of k) == 0,
        # so we can skip half the steps in this range
        (11..20).each do |i|
            if step % i == 0
                found = true
            else
                found = false
                break
            end
        end
        if found
            return step
        end
        step += 20
    end
end

puts "The number in question is #{finder()}."

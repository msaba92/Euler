#!/usr/local/bin/ruby -w

# What is the smallest positive number that is
# evenly divisible by all of the numbers from 1 to 20?

def finder
    found = false
    step = 20
    loop do
        # If n % k == 0 then obviously n % (any factor of k) == 0,
        # so we can skip half the steps in this range
        (11..20).each do |i|
            if (step % i).zero?
                found = true
            else
                found = false
                break
            end
        end
        return step if found
        step += 20
    end
end

puts "The number in question is #{finder}."

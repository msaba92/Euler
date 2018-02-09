#!/usr/local/bin/ruby -w

# Find the largest palindrome made from the product of two 3-digit numbers.

def isPalindrome(k)
    (0..k.length/2).each do |s|
        if k[s] != k[-(1+s)]
            return false
        end
    end
    return true
end

control = 0
(100..999).to_a.reverse.each do |i|
    (100..999).to_a.reverse.each do |j|
        k = i * j
        if isPalindrome(k.to_s) == true
            if k > control
                control = k
            end
        end
    end
end

puts("The largetst palindrome in question is #{control}")

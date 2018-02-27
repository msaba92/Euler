#!/usr/local/bin/ruby -w

total = 0

File.open("numbers", "r") do |myfile|
    myfile.each_line do |line|
        total += line.to_i
    end
end

puts total.to_s[0..9]

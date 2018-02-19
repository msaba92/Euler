#!/usr/local/bin/ruby -w

def Finder
    (2..1001).each do |a|
        (3..1001).each do |b|
            (4..1001).each do |c|
                if a + b + c == 1000
                    if a**2 + b**2 == c**2
                        return a, b, c, a*b*c
                    end
                elsif a + b + c > 1000
                    break
                end
            end
        end
    end
end

puts Finder()

#!/usr/local/bin/ruby -w

grid = []

File.open("grid", "r") do |mygrid|
    i = 0
    mygrid.each_line do |line|
        grid[i] = line.split
        i += 1
    end
end

biggest = 0

(0..grid.length - 1).each do |row|
    (0..grid[row].length - 1).each do |column|
        mynumber = grid[row][column].to_i
        total = [mynumber] * 4
        (1..3).each do |x|
            # Vertical
            begin
                total[0] *= grid[row + x][column].to_i
            rescue
                total[0] = 1
            end
            # Horizontal
            begin
                total[2] *= grid[row][column + x].to_i
            rescue
                total[2] = 1
            end
            # Diagonal Right
            begin
                total[1] *= grid[row + x][column + x].to_i
            rescue
                total[1] = 1
            end
            # Diagonal Left
            begin
                total[3] *= grid[row - x][column + x].to_i
            rescue
                total[3] = 1
            end
        end

        biggest = total.max if total.max > biggest
    end
end

puts biggest

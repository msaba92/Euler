#!/usr/bin/env python

grid = []

with open("grid", "r") as mygrid:
    mylines = mygrid.readlines()
    for gridn in enumerate(mylines):
        grid.append(mylines[gridn[0]].split())

biggest = 0

for row in range(0, len(grid)):
    for column in range(0, len(grid[row])):
        mynumber = int(grid[row][column])
        total = [mynumber]*4
        for x in range(1, 4):
            # Vertical
            try:
                total[0] = total[0] * int(grid[row + x][column])
            except IndexError:
                total[0] = 1
            # Horizontal
            try:
                total[2] *= int(grid[row][column + x])
            except IndexError:
                total[2] = 1
            # Diagonal Right
            try:
                total[1] *= int(grid[row + x][column + x])
            except IndexError:
                total[1] = 1
            # Diagonal Left
            try:
                total[3] *= int(grid[row - x][column + x])
            except IndexError:
                total[3] = 1
        if max(total) > biggest:
            biggest = max(total)

print(biggest)

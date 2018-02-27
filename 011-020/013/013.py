#!/usr/bin/env python

with open("numbers", "r") as myfile:
    numbers = myfile.readlines()

total = 0

for number in numbers:
    total += int(number)

print(str(total)[0:10])

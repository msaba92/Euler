#!/usr/bin/env python

# Find the difference between the sum of the squares of the
# first one hundred natural numbers and the square of the sum.


def Difference():
    tsum = 0
    tdiff = 0

    for x in range(1, 101):
        tsum += x**2
        tdiff += x

    return tsum - tdiff**2


if __name__ == "__main__":
    number = Difference()
    print("The number in question is %d." % number)

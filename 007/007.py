#!/usr/bin/env python

# What is the 10 001st prime number?


def findprime():
    knownprimes = [2]
    i = 3
    while len(knownprimes) < 10001:
        for x in knownprimes:
            if i % x == 0:
                prime = False
                break
            else:
                prime = True
        if prime:
            knownprimes.append(i)
        i += 1
    return knownprimes[-1]


if __name__ == "__main__":
    print("The number is %d." % findprime())

#!/usr/bin/env python

# What is the smallest positive number that is
# evenly divisible by all of the numbers from 1 to 20?


def finder():
    found = False
    step = 20
    while True:
        # If n % k == 0 then obviously n % (any factor of k) == 0,
        # so we can skip half the steps in this range
        for i in range(11, 21):
            if step % i == 0:
                found = True
            else:
                found = False
                break
        if found:
            return step
        step += 20


if __name__ == "__main__":
    number = finder()
    print("The number in question is %d." % number)

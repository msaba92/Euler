#!/usr/bin/env python

# Find the sum of all the multiples of 3 or 5 below 1000.


def main():
    total = 0
    for x in range(1, 1000):
        if x % 3 == 0 or x % 5 == 0:
            total = total + x
    print(total)


if __name__ == "__main__":
    main()

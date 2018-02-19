#!/usr/bin/env python

'''
By considering the terms in the Fibonacci sequence whose values
do not exceed four million, find the sum of the even-valued terms.
'''


def main():
    i = 1
    j = 0
    k = 0
    total = 0
    while k < 4000000:
        k = i + j
        j = i
        i = k
        try:
            if k % 2 == 0:
                total += k
        except ZeroDivisionError:
            total += k
    print(total)


if __name__ == "__main__":
    main()

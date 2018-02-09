#!/usr/bin/env python

# Find the largest palindrome made from the product of two 3-digit numbers.


def isPalindrome(k):
    for s in range(0, len(k)//2):
        if k[s] != k[-(1+s)]:
            return False
    return True


def main():
    total = []
    for i in range(999, 99, -1):
        for j in range(999, 99, -1):
            k = str(i * j)
            if isPalindrome(k) is True:
                total.append(int(k))
    print("The largest palindrome in question is", max(total))


main()

#!/usr/bin/env python

# What is the largest prime factor of the number 600851475143?

target = 600851475143


def isPrime(number):
    for j in range(2, int(number) // 2):
        if number % j == 0:
            return 1
    return 0


def main(target):
    for i in range(2, target // 2):
        k = target / i
        if k % 1 == 0:
            if isPrime(k) == 0:
                print("The highest prime factorial is", int(k))
                break


if __name__ == "__main__":
    main(target)

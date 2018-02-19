#!/usr/bin/env python


def isPrime(number, primes):
    for prime in primes:
        if number**0.5 >= prime:
            if number % prime == 0:
                return 1
        else:
            return 0


def main():
    total = 2
    primes = [2]
    for x in range(3, 2000000, 2):
        if isPrime(x, primes) == 0:
            primes.append(x)
            total += x
    print(total)


if __name__ == "__main__":
    main()

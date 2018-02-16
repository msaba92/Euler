#!/usr/bin/env python


def Finder():
    for a in range(2, 1001):
        for b in range(3, 1001):
            for c in range(4, 1001):
                if a + b + c == 1000:
                    if a**2 + b**2 == c**2:
                        return a, b, c, a*b*c
                elif a + b + c > 1000:
                    break


if __name__ == "__main__":
    print(Finder())

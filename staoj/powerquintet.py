import math

n = int(input())

maxn = math.ceil(n ** (1 / 4))

for a in range(maxn + 1):
    for b in range(a, maxn + 1):
        for c in range(b, maxn + 1):
            for d in range(c, maxn + 1):
                for e in range(d, maxn + 1):
                    if a**a + b**b + c**c + d**d + e**e == n:
                        print("Yes")
                        exit()
print("No")

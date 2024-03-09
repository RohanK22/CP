n = int(input())

ans = 0


def fact(n):
    if n <= 0:
        return 1
    else:
        f = 1
        for i in range(1, n + 1):
            f *= i
        return f


for i in range(2, n + 1):
    ans += (-1) ** i / fact(i)

ans *= fact(n)

print(int(ans))

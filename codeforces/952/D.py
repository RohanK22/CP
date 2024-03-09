from collections import defaultdict

t = int(input())

for _ in range(t):
    n, x, y = map(int, input().split(" "))
    arr = list(map(int, input().split(" ")))

    ans = 0

    m = [[0 for _ in range(y)] for _ in range(x)]

    for a in arr:
        m[a % x][a % y] += 1

    for i, a in enumerate(arr):
        ans += m[(x - (a % x)) % x][a % y] - (a % x == ((x - (a % x)) % x))

    print(ans // 2)

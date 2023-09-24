n = int(input())
a = [int(x) for x in input().split()]

ps = []
s = 0
for i in range(n):
    s ^= a[i]
    ps.append(s)

ans = 0
for i in range(n):
    for j in range(i, n):
        if i == 0:
            s = ps[j]
        else:
            s = ps[j] ^ ps[i - 1]
        ans += s * (j - i + 1)
        ans %= 998244353

print(ans)

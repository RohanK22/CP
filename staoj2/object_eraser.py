n, k = map(int, input().split())
a = list(map(int, input().split()))

ans = 0
for i in range(n - 1, -1, -1):
    if k >= a[i]:
        k -= a[i]
        ans += 1
    else:
        break

print(ans)

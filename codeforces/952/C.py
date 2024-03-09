t = int(input())

for i in range(t):
    n = int(input())
    arr = list(map(int, input().split(" ")))

    p0, p1 = 0, n - 1
    while p0 < n and arr[p0] == arr[0]:
        p0 += 1
    while p1 > -1 and arr[p1] == arr[n - 1]:
        p1 -= 1

    if n == 1:
        print(0)
        continue

    if arr[0] != arr[n - 1]:
        print(min(n - p0, p1 + 1))
    else:
        print(max(0, p1 - p0 + 1))

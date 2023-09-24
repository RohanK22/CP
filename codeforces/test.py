t = int(input())

for case in range(t):
    ans = True
    n, m, k = map(int, input().split())

    x, y = map(int, input().split())

    friendlocations = []
    if k >= 4:
        ans = False

    for j in range(k):
        a, b = map(int, input().split())
        friendlocations.append((a, b))

        diffx = abs(x - a)
        diffy = abs(y - b)

        diffxm2 = diffx % 2
        diffym2 = diffy % 2

        if (diffxm2 + diffym2) % 2 == 0:
            ans = False
        # print(a, b, diffx, diffy, diffxm2, diffym2, ans)
    # print(n, m, k)
    # print(x, y)

    print("YES" if ans else "NO")

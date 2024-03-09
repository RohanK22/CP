t = int(input())

for i in range(t):
    n = int(input())
    arr = list(map(int, input().split(" ")))

    s = sum(arr)
    if s % n != 0:
        print("NO")
        continue
    avg = s // n
    # print(s, avg)

    excess = 0
    f = True
    for i in range(n):
        excess += arr[i] - avg

        if excess < 0:
            print("NO")
            f = False
            break
    if f:
        print("YES")

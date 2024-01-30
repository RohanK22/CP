t = int(input())

for case in range(t):
    n = int(input())
    a = map(int, input().split())

    xors = 0
    for num in a:
        xors ^= num

    if n % 2 == 0:
        if xors == 0:
            print("0")
        else:
            print("-1")
        continue

    for i in range(2**8):
        if xors ^ i == 0:
            print(i)
            break

k = int(input())
start = sorted(map(int, input().split(" ")))
limit = 10**k

prevLayer = None
curlayer = start.copy()

ans = curlayer.copy()
while True:
    prevLayer = curlayer
    curlayer = []

    for n in prevLayer:
        for i in start:
            if int(str(n) + str(i)) < limit:
                curlayer.append(int(str(n) + str(i)))
                ans.append(int(str(n) + str(i)))
            else:
                # print(ans)
                print(" ".join(map(str, ans)))
                exit()

t = int(input())

for case in range(t):
    n, k = map(int, input().split())

    colours = list(map(int, input().split()))

    # find Since Vika is afraid of falling, she does not want to take too long steps. Help her and tell her the minimum possible maximum number of planks she will have to cross in one step, if she can repaint one (or zero) plank a different color while crossing the bridge.

    if k == 1:
        print(0)
        continue

    maxgap = 0
    minpossiblemaxgap = float("inf")

    # for every colour, find the longest consecutive sequence not of that colour
    for colour in range(1, k + 1):
        l = 0
        for c in range(n):
            if colours[c] != colour:
                l += 1
            else:
                maxgap = max(maxgap, l)
                l = 0
        minpossiblemaxgap = min(minpossiblemaxgap, maxgap)
    print("maxgap", maxgap)
    print("minpossiblemaxgap", minpossiblemaxgap)

    print(minpossiblemaxgap // 2)

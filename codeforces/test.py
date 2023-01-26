# 5
# 18 19 -130 6 100
# 4
# 18 LARGER
# -1000 SMALLER
# -300 LARGER
# 0 SMALLER

n = int(input())
a = sorted(list(map(int,input(). split())))
op = int(input())
print(a)
mx, mi = max(a), min(a)

for o in range(op):
    s = input().split()
    x = int(s[0])
    comp = s[1]

    if x > mx:
        if comp =="LARGER":
            print(0)
        else:
            print(n)
        continue
    elif x < mi:
        if comp =="LARGER":
            print(n)
        else:
            print(0)
        continue
    
    i, j = 0, len(a) - 1
    m = (i + j) //2
    while i <= j:
        if x <= a[m]:
            i = m + 1
        else:
            j = m - 1
        m = (i + j) //2

    if comp == "LARGER":
        print(n - m + 1)
    else:
        while a[m] >= x:
            m -= 1
        print(m + 1)
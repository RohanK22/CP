# 3
# 4
# 7 4
# 9 3
# 4 6
# 2 2
# 2
# 4 6
# 100 100
# 2
# 1337 3
# 1337 3


t = int(input())

for _ in range(t):
    n = int(input())
    ps, pe = None, None
    ans = 0
    for _ in range(n):
        s, e = map(int, input().split())
        if ps is None:
            ps, pe = s, e
        else:
            if s >= ps and e >= pe:
                ans = -1
    print(ans if ans == -1 else ps)

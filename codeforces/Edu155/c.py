# 3
# 10010
# 111
# 0101

t = int(input())
for _ in range(t):
    s = input()

    reps = []

    p = s[0]
    c = 0
    for i in range(1, len(s)):
        if s[i] == p:
            c += 1
        else:
            if c > 0:
                reps.append(c)
            c = 0
            p = s[i]
    if c > 0:
        reps.append(c)

    ans1 = sum(reps)

    if ans1 == 0:
        print(ans1, 1)
        continue

    d = dict()

    def fact(n):
        if n in d:
            return d[n]
        f = 1
        for i in range(1, n + 1):
            f = f * i
        d[n] = f
        return f

    ans2 = 1
    for rep in reps:
        ans2 = ans2 * fact(rep + 1)
    ans2 = ans2 * fact(len(reps))
    ans2 = ans2 % 998244353

    print(ans1, ans2)

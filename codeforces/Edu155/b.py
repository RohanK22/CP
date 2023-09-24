# 4
# 3
# 1 4 1
# 3 2 2
# 1
# 4
# 5
# 2
# 4 5
# 2 3
# 5
# 5 2 4 5 3
# 3 4 2 1 5

t = int(input())
for _ in range(t):
    n = int(input())
    a = [int(x) for x in input().split()]
    b = [int(x) for x in input().split()]

    print(min(sum(a) + n * min(b), sum(b) + n * min(a)))

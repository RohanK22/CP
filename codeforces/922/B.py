# 1 2 3 4 5
# 5 4 3 2 1

# minimise inversion count of a and b
# only swaps allowed where swapping i, j in a also swaps i, j in b

t = int(input())

for case in range(t):
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))

    inv_count_a = [0] * (n + 1)
    inv_count_b = [0] * (n + 1)

    # minimise sum(inv_count_a) + sum(inv_count_b)

    # calculate inv_counts
    for i in range(n):
        inv_count_a[a[i]] = i
        inv_count_b[b[i]] = i

    print(a)
    print(b)

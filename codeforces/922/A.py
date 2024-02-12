# 5
# 2 2
# 7 8
# 16 9
# 3 5
# 10000 10000

import math

t = int(input())

# goal is to build a n x m grid out of bricks of size 1 x k where k >= 2
# with max stability = horizontal - vertical bricks

for case in range(t):
    n, m = map(int, input().split())

    max_horiz_per_row = m // 2

    print(max_horiz_per_row * n)

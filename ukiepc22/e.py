# As CTO (Chief Transport Officer) at your new logistics company, one of your duties is to bring
# the packages of various sizes to the loading area to supply the delivery vehicles for the day.
# The vehicles load up one-by-one. Each vehicle is loaded automatically by a machine that finds
# the largest package that can fit in the vehicle without over-weighting, and loading it on. This
# repeats until no more packages can fit and the next vehicle approaches.
# Knowing the number of vehicles, and the sizes of packages you have available, what is the
# smallest weight limit per vehicle that you can set while ensuring you distribute all of the
# packages?

# 6 4
# 1 1 1 1 1 1

from collections import Counter
from heapq import heapify, heappop, heappush

n, v = map(int, input().split(" "))  # v = number of vehicles
s = sorted(map(int, input().split(" ")), reverse=True)

ans = 0

# binary search on possible truck sizes
l, r = max(s), sum(s)

while l <= r:
    m = (l + r) // 2

    # greedy
    h = list(map(lambda x: -x, s))
    heapify(h)
    for vid in range(v):
        cap = m
        residuals = []
        while len(h) > 0:
            if cap >= -h[0]:
                cap += heappop(h)
            else:
                # go finding next smallest one that can be added
                residuals.append(heappop(h))
        for residual in residuals:
            heappush(h, residual)

    if len(h) == 0:
        r = m - 1
        ans = m
    else:
        l = m + 1

print(ans)

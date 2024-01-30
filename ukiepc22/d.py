# Hook-a-duck is the traditional sport of floating rubber ducks in a tub, distributing long hooked
# poles to participants, and awarding points to participants for retrieving their duck.
# Today we are organising the first world championship in hook-a-duck-ery. To facilitate the event,
# we used a local river instead of a single tub and floated each contestant’s duck down to some
# distinct spot on the opposite bank. Now, the contestants will line up at their unique assigned
# places and try to latch their own duck fastest.
# However, not everyone can retrieve their duck at the same time. If two participants would
# otherwise need to cross poles to fetch ducks, we will have to organise them into separate rounds.
# How many rounds, at minimum, do we need to organise?


# bascically count number of intersections

# 3
# 5 1 2
# 2 4 1

n = int(input())
p = list(map(int, input().split(" ")))
d = list(map(int, input().split(" ")))

ans = 0

for i in range(n):
    for j in range(i + 1, n):
        p1, p2 = p[i], p[j]
        d1, d2 = d[i], d[j]

        if (p1 < p2 and d1 > d2) or (p1 > p2 and d1 < d2):
            ans += 1

print(ans)

# LOL definitely isn't it

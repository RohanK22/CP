# 10 8 3
# 1 9 4
# 1 2
# 1 7
# 3 9
# 3 4
# 3 6
# 4 5
# 4 6
# 6 8

from collections import defaultdict

n, m, c = map(int, input().split(" "))
meds = set(map(int, input().split(" ")))

g = defaultdict(list)
dist_to_med = [-1] * n

# for m in meds:
#     dist_to_med[m - 1] = 0

for i in range(m):
    a, b = map(int, input().split(" "))
    g[a].append(b)
    g[b].append(a)

# BFS outwards from med students
queue = []
for m in meds:
    queue.append(m)

visited = set()
level = 0
while queue:
    new_queue = []
    for node in queue:
        if node in visited:
            continue
        visited.add(node)
        dist_to_med[node - 1] = level
        for neighbor in g[node]:
            new_queue.append(neighbor)
    queue = new_queue
    level += 1

print(" ".join(map(str, dist_to_med)))

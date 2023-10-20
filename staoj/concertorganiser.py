# Kay and Alden are organising a classical music concert.

# Kay is in charge of organising a concert venue, and Alden is in charge of creating a programme. There're
# �
# N pieces being performed in the concert, and in determining the order of the pieces, he asks Kay if he has any preference over the order, and Kay said he wants the piece
# �
# �
# p
# i
# ​
#   to be performed before piece
# �
# �
# q
# i
# ​
#   (
# 1
# ≤
# �
# ≤
# �
# 1≤i≤M).

# Can Alden create a programme that follows all of Kay's
# �
# M requests?

from collections import defaultdict, deque

n, m = map(int, input().split(" "))

g = defaultdict(list)

# topological sort
indegree = {node: 0 for node in range(1, n + 1)}

for i in range(m):
    p, q = map(int, input().split(" "))
    g[p].append(q)
    indegree[q] += 1

q = deque()
for node in indegree:
    if indegree[node] == 0:
        q.append(node)

ordering = []
v = set()
while q:
    node = q.popleft()
    ordering.append(node)
    v.add(node)
    for neighbor in g[node]:
        indegree[neighbor] -= 1
        if indegree[neighbor] == 0:
            q.append(neighbor)
            if neighbor in v:
                print("No")
                exit()

if len(ordering) == n:
    print("Yes")
else:
    print("No")

n = int(input())
m1 = int(input())
pairs1 = [tuple(map(int, input().split())) for _ in range(m1)]
m2 = int(input())
pairs2 = [tuple(map(int, input().split())) for _ in range(m2)]

# disjoint set union
parent = list(range(n + 1))


def find(x):
    if parent[x] == x:
        return x
    parent[x] = find(parent[x])
    return parent[x]


for p, q in pairs1:
    parent[find(p)] = find(q)

ans = 0
for p, q in pairs2:
    if find(p) == find(q):
        ans += 1

print(ans)

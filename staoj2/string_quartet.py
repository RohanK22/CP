ls = []
rs = []
for _ in range(4):
    l, r = map(int, input().split())
    ls.append(l)
    rs.append(r)

print(max(0, min(rs) - max(ls)))

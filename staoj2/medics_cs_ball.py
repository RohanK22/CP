n = int(input())
kx, ky, lx, ly = map(int, input().split())
pos = []

for _ in range(n):
    x, y = map(int, input().split())
    pos.append((x, y))

ans = 0

for i in range(n):
    for j in range(i + 1, n):
        x1, y1 = pos[i]
        x2, y2 = pos[j]

        # kay is on line segment
        if (ky - y1) * (kx - x2) == (ky - y2) * (kx - x1):
            if min(x1, x2) <= kx <= max(x1, x2) and min(y1, y2) <= ky <= max(y1, y2):
                ans += 1
                continue

        # liana is on line segment
        if (ly - y1) * (lx - x2) == (ly - y2) * (lx - x1):
            if min(x1, x2) <= lx <= max(x1, x2) and min(y1, y2) <= ly <= max(y1, y2):
                ans += 1
                continue

        # check if lines are parallel
        if (ky - ly) * (x1 - x2) == (y1 - y2) * (kx - lx):
            continue

        px = (kx * ly - ky * lx) * (x1 - x2) - (kx - lx) * (x1 * y2 - y1 * x2)
        px = px / ((kx - lx) * (y1 - y2) - (ky - ly) * (x1 - x2))

        py = (kx * ly - ky * lx) * (y1 - y2) - (ky - ly) * (x1 * y2 - y1 * x2)
        py = py / ((kx - lx) * (y1 - y2) - (ky - ly) * (x1 - x2))

        if (
            min(x1, x2) <= px <= max(x1, x2)
            and min(y1, y2) <= py <= max(y1, y2)
            and min(kx, lx) <= px <= max(kx, lx)
            and min(ky, ly) <= py <= max(ky, ly)
        ):
            ans += 1

print(ans)

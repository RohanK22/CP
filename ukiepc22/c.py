# Colours on computer screens are made up of red, green, and blue lights shining at different
# brightnesses. The ratio of the brightness of each light to the others determines the shade, and the
# total intensity determines the brightness.
# For example, 3 lights shining at brightnesses 10:6:4 certainly don’t shine as brilliantly as 3 lights
# shining at brightnesses 50:30:20, nonetheless they represent exactly the same shade.
# Starting from complete blackness, we will add one unit of brightness to one of the red, green, or
# blue lights at a time. How many unique shades will we create this way?

# 3
# red green red


def divisor(N):  # divisors of N
    n = 1
    div = []
    while n**2 <= N:
        if N % n == 0:
            if N // n != n:
                div.append(n)
                div.append(N // n)
            else:
                div.append(n)
        n += 1
    return sorted(div)


def get_prime(N):  # prime numbers <= N
    sample = []
    for i in range(N + 1):
        sample.append(True)
    sample[0] = False
    sample[1] = False
    head = int(N**0.5) + 1
    for i in range(2, head + 1):
        v = 2
        while True:
            if i * v > N:
                break
            sample[i * v] = False
            v += 1
    ans = []
    for i in range(N + 1):
        if sample[i]:
            ans.append(i)
    return ans


def is_prime(N):  # judge if N is prime
    if N % 2 == 0 and N > 2 or N == 1:
        return False
    else:
        if all(N % i != 0 for i in range(2, int(N**0.5) + 1)):
            return True
        else:
            return False


def convert(N, base):  # N(10) -> ?(base)
    code = ""
    while N > 0:
        code = str(N % base) + code
        N = N // base
    return code


def substring(S):  # all the substrings of S
    li = [""]
    L = len(S)
    for i in range(L):
        for j in range(i + 1, L + 1):
            li.append(S[i:j])
    return li


class UnionFind:  # dsu
    def __init__(self, n):
        self.n = n
        self.parents = [-1] * n

    def find(self, x):  # root of a group x belongs to
        if self.parents[x] < 0:
            return x
        else:
            self.parents[x] = self.find(self.parents[x])
            return self.parents[x]

    def unite(self, x, y):  # unite x and y
        x = self.find(x)
        y = self.find(y)
        if x == y:
            return
        if self.parents[x] > self.parents[y]:
            x, y = y, x
        self.parents[x] += self.parents[y]
        self.parents[y] = x

    def size(self, x):  # size of a group x belong to
        return -self.parents[self.find(x)]

    def same(self, x, y):  # judge if x and y are in the same group
        return self.find(x) == self.find(y)

    def members(self, x):  # list of members in a group x belongs to
        root = self.find(x)
        return [i for i in range(self.n) if self.find(i) == root]

    def roots(self):  # list all roots
        return [i for i, x in enumerate(self.parents) if x < 0]

    def group_count(self):  # the number of groups
        return len(self.roots())


from collections import Counter


def prime_factorisation(n):  # prime factorisation
    li = []
    for i in range(2, int(n**0.5) + 1):
        while True:
            if n % i == 0:
                li.append(i)
                n = n // i
            else:
                break
    if n > int(n**0.5):
        li.append(n)
    dic = dict(Counter(li))
    return dic


def transpose(board):  # transpose the matrix
    n = len(board)
    m = len(board[0])
    ans = [["."] * n for _ in range(m)]
    for i in range(n):
        for j in range(m):
            ans[j][i] = board[i][j]
    return ans


import heapq


def dijkstra(
    graph, N, s
):  # dijkstra algorithm starting at s and the number of nodes is N
    dist = [float("inf") for _ in range(N)]
    dist[s] = 0

    data = [[0, s]]  # [distance, index]
    heapq.heapify(data)
    while data:
        pos = heapq.heappop(data)[1]
        for node, cost in graph[pos]:
            if dist[pos] + cost < dist[node]:
                dist[node] = dist[pos] + cost
                heapq.heappush(data, [dist[node], node])
    return dist


def matrix_multiplication(A, B):  # multiply matrix A by B
    a = len(A)
    b = len(A[0])
    c = len(B[0])
    M = []
    for i in range(a):
        M.append([])
    for i in range(a):
        for k in range(c):
            M[i].append(0)
    for i in range(a):
        for k in range(c):
            s = 0
            for j in range(b):
                s += A[i][j] * B[j][k]
            M[i][k] = s
    return M


def matrix_multiplication_modulo(A, B, mod):  # multiply matrix A by B % mod
    a = len(A)
    b = len(A[0])
    c = len(B[0])
    M = []
    for i in range(a):
        M.append([])
    for i in range(a):
        for k in range(c):
            M[i].append(0)
    for i in range(a):
        for k in range(c):
            s = 0
            for j in range(b):
                s += A[i][j] * B[j][k]
                s %= mod
            M[i][k] = s
    return M


def gcd(a, b):
    while b:
        a, b = b, a % b
    return a


n = int(input())
cols = input().split(" ")

r, g, b = 0, 0, 0
ratios = set()

for col in cols:
    if col == "red":
        r += 1
    elif col == "green":
        g += 1
    else:
        b += 1
    gcd_ = gcd(gcd(r, g), b)
    ratios.add((r // gcd_, g // gcd_, b // gcd_))

print(len(ratios))

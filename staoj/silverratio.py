# a(i) = p * a(i - 1) + q * a(i - 2)

# lim n -> inf (a(n + 1) / a(n)) = d

q, d = map(int, input().split(" "))

# find p

N = 1000000 # some large value

a = [0] * N
a[0] = 1
a[1] = 1


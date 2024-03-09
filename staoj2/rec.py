# Given a recursion rule $a_{n + 1} = pa_n + q$, where $a_1 = 1$, output the value of $a_X$ mod $(10^9 + 7)$ given $X$.

p, q = map(int, input().split())
x = int(input())

MOD = 10**9 + 7

prev = 1
for i in range(1, x):
    prev = (p * prev + q) % MOD

print(prev)

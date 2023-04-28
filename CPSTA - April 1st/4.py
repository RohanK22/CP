limit = int(input())

sieve = [True] * (limit + 1)                        # Initialize the primality list
sieve[0] = sieve[1] = False

for (i, isprime) in enumerate(sieve):
    if isprime:
        for n in range(i*i, limit + 1, i):     # Mark factors non-prime
            sieve[n] = False

ans = 0
for idx, i in enumerate(sieve):
    if i:
        ans -= idx
    else:
        ans += idx

print(ans)

# Tokyo is a wonderland of gastronomy.
# There're $N$ sushi places and $M$ ramen places in one area of Tokyo. $i$-th sushi place costs you $A_i$ yen ($1 \leq i \leq N$) and $j$-th ramen place costs you $B_j$ yen ($1 \leq j \leq M$) (note: yen is a Japanese currency).
# You decided to go to one sushi restaurant for lunch and one ramen restaurant for dinner. Given an integer $K$ ($1 \leq K \leq N + M$), output the $K$-th biggest price you're going to spend in total. More formally, output the $K$-th greatest value of $A_i + B_j$ where $1 \leq i \leq N$ and $1 \leq j \leq M$.

n, m, k = map(int, input().split())

sushi = list(map(int, input().split()))
ramen = list(map(int, input().split()))

# brute force
prices = []
for s in sushi:
    for r in ramen:
        prices.append(s + r)

prices.sort(reverse=True)
ans = prices[k - 1]
print(ans)

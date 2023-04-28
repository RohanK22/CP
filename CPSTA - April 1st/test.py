n, T = input().split(' ')
n = int(n)
T = int(T)

W = [int(i) for i in input().split(' ')]
W = sorted(W, reverse=True)
l = len(W)


# find minimum number of weights reqruied to sum to T

ans = -1
def dfs(idx, pl, cur_sum):
    global ans

    if idx == l:
        return
    
    if cur_sum == T:
        ans = pl
        return
    
    if cur_sum > T:
        return
    
    dfs(idx+1, pl, cur_sum)
    dfs(idx+1, pl+1, cur_sum+W[idx])

dfs(0, 0, 0)

print(ans)



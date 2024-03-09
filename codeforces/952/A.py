t = int(input())


for i in range(t):
    n = int(input())

    def dfs(curr, s):
        if curr > n or len(s) > 3:
            return None
        if curr == n and len(s) == 3:
            return s

        if curr < n and len(s) < 3:
            for i in range(26):
                ans = dfs(curr + i + 1, s + chr(97 + i))
                if ans != None:
                    return ans

    print(dfs(0, ""))

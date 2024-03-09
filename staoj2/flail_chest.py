s = input()
broken_count = 0
n = len(s)
for i in range(n):
    if s[i] == "x":
        broken_count += 1
    else:
        broken_count = 0

    if broken_count >= 3:
        print("Yes")
        exit()

print("No")

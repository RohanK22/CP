n = int(input())
s = input().split(" ")  # has n words
t = input()  # acronym

firstchars = [word[0] for word in s]
d = set(firstchars)

# if every char is valid and no dup
seen = set()
for c in t:
    if c in seen:
        print("No")
        exit()
    seen.add(c)

    if c not in d:
        print("No")
        exit()

# check ordering
i = 0  # idx in firstchars
for c in t:
    found = False
    while i < n:
        if firstchars[i] == c:
            found = True
            break
        i += 1

    if not found:
        print("No")
        exit()
    i += 1

print("Yes")

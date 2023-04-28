# input
# 11
# goodmorning

n = int(input())
s = input()

for i in range(len(s)):
    if i < n:
        if s[i].islower():
            print(s[i].upper(), end='')
        else:
            print(s[i].lower(), end='')
    else:
        print(s[i], end='')

print('\n')

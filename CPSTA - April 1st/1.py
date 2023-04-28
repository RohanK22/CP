split = input().split(' ')
g = int(split[0])
y = int(split[1])
r = int(split[2])

t = int(input())
# g yr yg yr yg

col = 'green'
ans = ''
pr = False
while t >=0:
    ans = col
    if col == 'green':
        t -= g
        col = 'yellow'
    elif col == 'yellow':
        t -= y
        if pr:
            col = 'green'
        else:
            col = 'red'
        pr = not pr
    elif col == 'red':
        t -= r
        col = 'yellow'
   
print(ans)
split = input().split(' ')

n = int(split[0])
X = int(split[1])

a = [int(i) for i in input().split(' ')]

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

lcm = 1
for i in a:
    lcm = lcm*i//gcd(lcm, i)

if lcm > X:
    print(-1)
else:
    divs = X // lcm
    print(lcm * divs)
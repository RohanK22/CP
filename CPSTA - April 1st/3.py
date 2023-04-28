dn = int(input())

d = dict()

for i in range(dn):
    drug, onset, duration = input().split(' ')

    k = onset + '-' + duration
    if k in d:
        d[k].append(drug)
    else:
        d[k] = [drug]

qn = int(input())

for q in range(qn):
    onset, duration = input().split(' ')

    k = onset + '-' + duration
    if k in d:
        print(', '.join(sorted(d[k])))
    else:
        print('NONE')

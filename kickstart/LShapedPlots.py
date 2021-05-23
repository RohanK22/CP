n = int(input())

def getNei(mat, r , c, cr, cc, tr, tc):
	s = 0
	while r < tr and r >-1 and c <tc and c > -1 and mat[r][c] != 0:
		s += 1
		r += cr
		c += cc
	return s
	
def pair(l1, l2):
	if l1 <= 1 or l2 <= 1:
		return 0
	elif l1 <= 3 and l2 <= 3:
		return 0
			
	ans = 0
	for i in range(2, l1+1):
		for j in range(2, l2 + 1):
			if i != j and (i == 2* j or j ==2 * i):
				ans+=1
	return ans

for case in range(n):
	s = input().split(" ")
	row = int(s[0])
	col = int(s[1])

	ans = 0
	mat = []
	for r in range(row):
		s = input().split(" ")
		t = []
		for c in range(col):
			t.append(int(s[c]))
		mat.append(t)

	for r in range(row):
		for c in range(col):
			if mat[r][c] == 0:
				continue
			up = getNei(mat, r , c, -1, 0, row, col)
			left = getNei(mat, r , c, 0, -1, row, col)
			down = getNei(mat, r , c, 1, 0, row, col)
			right = getNei(mat, r , c, 0, 1, row, col)

			ans += pair(up, left) + pair(up, right) + pair(down, left) + pair(down, right)

	print("Case #", case+1,": ", ans, sep='')

n = int(input())

for case in range(n):
	s = input().split(" ")
	row = int(s[0])
	col = int(s[1])

	mat = []
	for r in range(row):
		s = input().split(" ")
		t = []
		for c in range(col):
			t.append(int(s[c]))
		mat.append(t)

	diffMat
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

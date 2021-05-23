n = int(input())
for i in range(n):
	s = input()
	N = int(s.split(" ")[0])
	k = int(s.split(" ")[1])
	word = input()
	x = 0
	swaps = 0
	for j in range(N//2):
		if word[j] != word[N-j-1]:
			x+=1
	
	if x==k:
		swaps = 0
	elif x > k:
		swaps = x -k
	else: 
		swaps = k - x

	print("Case #", i+1,": ", swaps, sep='')

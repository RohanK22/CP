// Source: https://usaco.guide/general/io
#include <bits/stdc++.h>
using namespace std;

int main() {
	freopen("billboard.in", "r", stdin);
	freopen("billboard.out", "w", stdout);
	
	int x1, y1, x2, y2;
	int x3, y3, x4, y4;
	cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;

	int ox = max(0, min(x2, x4) - max(x1, x3));
	int oy = max(0, min(y2, y4) - max(y1, y3));
	
	if(ox == x2 - x1 && oy == y2 - y1) cout<<0;
	else if(ox != x2 - x1 && oy == y2 - y1) cout<<oy*max(0,x2 - x1 - ox);
	else if(ox == x2 - x1 && oy != y2 - y1) cout<<ox*max(0,y2 - y1 - oy);
	else cout<<(x2 - x1) * (y2 - y1);

	return 0;
}

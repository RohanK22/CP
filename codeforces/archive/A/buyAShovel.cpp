#include <bits/stdc++.h>
using namespace std;

#define ll long long
#define fo(i, n) for(i=0;i<n;i++)

//^B for run

void solve() {
	int k, r;
	cin>>k>>r;
		int t = 1;
		int rem = (t * k % 10);
		while(!(rem ==r || rem ==0)) {
			t++;
			rem = (t * k % 10);
		}
		cout<<t;
	cout<<endl;
}

int main() {
	// int cases;
	// cin>>cases;
	// for(int c = 0; c< cases; c++) 
		solve();
}
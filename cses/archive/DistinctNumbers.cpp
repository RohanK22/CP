#include <bits/stdc++.h>

using namespace std;

#define ll long long
#define ld long double
#define ar array
#define pb push_back
#define vi vector
#define pi pair

#define sz(c) int((c).size())
#define all(c) (c).begin(), (c).end()
#define rall(c) (c).rbegin(), (c).rend()

#define FOR(i, a, b, s) for (int i=(a); (s)>0?i<(b):i>(b); i+=(s))
#define FOR1(e) FOR(i, 0, e, 1)
#define FOR2(i, e) FOR(i, 0, e, 1)
#define FOR3(i, b, e) FOR(i, b, e, 1)
#define FOR4(i, b, e, s) FOR(i, b, e, s)

template <typename T>
vi<T> read(T n) {
    vi<T> v;
    T temp;
    while(n--) {
        cin>>temp;
        v.pb(temp);
    }
        
    return v;
}

void solve() {
    ll n; 
    cin>>n;
    vi<ll> v = read(n);
    set<ll> s(all(v));
    cout<<sz(s)<<endl;
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
     
    int t=1;
    // cin>>t;
    FOR1(t) {
    	//write("Case #", i+1, ": ");
        solve();
    }
    return 0;
}
#include <bits/stdc++.h>

using namespace std;

#define ll long long
#define pb push_back
#define vi vector
#define pi pair

#define sz(c) int((c).size())
#define all(c) (c).begin(), (c).end()
#define rall(c) (c).rbegin(), (c).rend()

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

int main() {
    int n; cin >> n;
    vector<int> v = read(n);
 
    sort(all(v));
    v.erase(unique(v.begin(), v.end()), v.end());
 
    if (sz(v) <= 2 || (sz(v) == 3 && 2*v[1] == v[0]+v[2])) {
        cout << "YES\n";
    }
    else {
        cout << "NO\n";
    }
    return 0;
}
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
    int n,m;
    cin>>n>>m;
    int f[n][n];

    for(int i = 0; i < n; i++) 
        for(int j = 0; j < n; j++) 
            f[i][j] = 0;
    
    for(int j = 0; j < m; j++) {
        int x,y,c;
        cin>>x>>y>>c;
        f[x - 1][y - 1] = c;
    } 
    
    for(int i = 0; i < n; i++) 
        for(int j = 0; j < n; j++) 
            for(int k = 0; k < n; k++) {
                if(f[i][j] > 0 && f[i][j] == f[j][k] && f[j][k] == f[k][i]) {
                    f[i][j] = 0;
                    f[j][k] = 0;
                    f[k][i] = 0;
                    continue;
                }
                if(f[i][j] > 0 && f[j][k] > 0) {
                    int delta = min(f[i][j], f[j][k]);
                    f[i][j] -= delta;
                    f[j][k] -= delta;
                    f[i][k] += delta;
                }
            }
    
    ll ans = 0;
    for(int i = 0; i < n; i++) 
        for(int j = 0; j < n; j++) 
            ans += f[i][j];
    
    cout<<ans<<endl;
    return 0;
}
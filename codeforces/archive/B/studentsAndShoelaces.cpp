#include <bits/stdc++.h>

using namespace std;

#define ll long long
#define pb push_back
#define vi vector
#define pi pair

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

    // My first graph problem
    ll n,m;
    cin>>n>>m;
    vi<ll> list[101];

    for(int i = 0; i< m; i++) {
        ll x,y; 
        cin>>x>>y;
        list[x].pb(y);
        list[y].pb(x);
    }

    ll ans =0;
    while(true) {
        bool flag = false;
        vi<ll> d;
        for(ll i = 0;i < m; i++) {
            if(list[i].size() == 1) {
                flag = true;
                d.pb(i);
                list[i].clear();
            }
        }


        if(!flag) break;

        for(ll i = 0;i< d.size(); i++) {
            for(ll j = 1; j <= n;j ++) {
                for(ll k = 0;k<list[j].size();k++) {
                    if(list[j][k] == d[i]) {
                        list[j].erase(list[j].begin() + k);
                    }
                }
            }
        }
        ans++;
    }

    cout<<ans;
    return 0;
}
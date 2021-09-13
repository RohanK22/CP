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
    double vp, vd,t, f,c, distance;
    cin>>vp>>vd>>t>>f>>c;
    ll ans = 0;
    
    if(vp < vd){
        distance = vd * vp * t / (vd-vp);
        while(distance<c){
            distance = vd * (distance + vp * (f + distance / vd)) / (vd-vp);
            ++ans;
        }
    }

    cout<<ans<<endl;
    return 0;
}
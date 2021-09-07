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
    ll n;
    cin>>n;
    vi<ll> v = read(n);
    std::sort(v.begin(), v.end());
    
    ll a,b,c;
    for(int i = 1; i < n - 1; i++) {
        a = v[i - 1];b=v[i];c=v[i+1];
        if((a + b > c && a + c > b && b + c > a)) {
            cout<<"YES"<<endl;
            return 0;
        }
    }

    cout<<"NO"<<endl;
    return 0;
}
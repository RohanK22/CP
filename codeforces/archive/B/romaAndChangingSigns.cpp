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
    int n,k;
    cin>>n>>k;
    vi<int> v = read(n);

    ll s = 0;
    int min = INT_MAX;

    for(int i = 0; i < n;  i++ ) {
        if(k > 0 && v[i] < 0) {
            k --;
            s -= v[i];
        } else
            s += v[i];
        if(min > abs(v[i])) 
            min = abs(v[i]);
    }

    if(k != 0 && k % 2 != 0) {
        s += min * -2;
    }

    cout<<s<<endl;
    return 0;
}
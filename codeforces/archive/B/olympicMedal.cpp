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
    int n;
    cin>>n;
    vi<int> r1s = read(n);
    std::sort(r1s.begin(), r1s.end());
    int r1 = r1s[n - 1];

    int m;
    cin>>m;
    vi<int> p1s = read(m);
    std::sort(p1s.begin(), p1s.end());
    int p1 = p1s[m - 1];
    
    int k;
    cin>>k;
    vi<int> p2s = read(k);
    std::sort(p2s.begin(), p2s.end());
    int p2 = p2s[0];

    int A,B;
    cin>>A>>B;

    double r2;
    cout<<fixed<<setprecision(12);
    r2 = 1.0 * r1 * sqrt(1.0 * B * p1 / (B * p1 + A * p2));
    cout<<r2<<endl;
    return 0;
}
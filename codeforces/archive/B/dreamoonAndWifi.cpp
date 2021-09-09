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

ll f(ll n, ll r)
{
    if(n)
       return f(n - 1, r + 1) + f(n - 1, r - 1);
    else if(r == 0)
       return 1;
    else   
        return 0;
}

int main() {
    double p = 1.0;
    std::cout << std::fixed;
    std::cout << std::setprecision(12);
    string a,b;
    cin>>a>>b;

    ll n = a.length(); 
        ll posA = 0, posB = 0, nQ = 0;
        for(int i = 0; i< n; i++) {
            if(a[i] == '+') {
                posA++;
            } else {
                posA--;
            }
            if(b[i] == '+') {
                posB++;
            } else if(b[i] == '-'){
                posB--;
            } else {
                nQ++;
            }
        }
    cout<<fixed<<setprecision(12)<<f(nQ, posA - posB)/pow(2,nQ)<<endl;
    

    return 0;
}
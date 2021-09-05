#include<bits/stdc++.h>
 
#define ll long long
#define int long long
#define pb push_back
#define mp make_pair
#define eb emplace_back
#define fi first
#define se second
#define PI 3.1415926535897932384626433832795
#define MOD 1000000007
#define all(a) a.begin(),a.end()
using namespace std;
mt19937 rng(chrono::steady_clock::now().time_since_epoch().count());
//------------------------------------------------------------------------------
ll power(ll a,ll n)
{
          ll result=1;
          while(n>0)
          {
               if(n&1)
                    result=result*a;
               a=a*a;
               n=n>>1;
          }
          return result;
}
ll lcm(ll a,ll b)
{
          return ((a*b)/__gcd(a,b));
}
ll __ceil(ll a,ll b)
{
            return (a+b-1)/b;
}
bool ispow2(ll n)
{
          return (ceil(log2(n))==floor(log2(n)));
}
bool isprime(ll n)
{
          if(n==1)
               return false;
          else if(n==2)
               return true;
          else
          {
               for(ll i=2;i*i<=n;++i)
               {
                    if(n%i==0)
                         return false;
               }
               return true;
          }
}
 
ll ncr(ll n,ll r)
{
    if(r > n - r)
          r = n - r;
    ll ans = 1;
    ll i;
 
    for(i = 1; i <= r; i++)
     {
        ans *= n - r + i;
        ans /= i;
    }
 
    return ans;
}
void sieve(int n)
{
 
    bool prime[n+1];
    memset(prime, true, sizeof(prime));
     prime[1]=false;
     prime[0]=false;
    for (int p=2; p*p<=n; p++)
    {
        if (prime[p] == true)
        {
            for (int i=p*p; i<=n; i += p)
                prime[i] = false;
        }
    }
    for (int p=2; p<=n; p++)
       if (prime[p])
          cout<<p<<" ";
}
 
int modpow(int x, int n, int m = MOD)
{
     if (n == 0) return 1 % m;
     long long u = modpow(x, n / 2, m);
     u = (u * u) % m;
     if (n % 2 == 1) u = (u * x) % m;
     return u;
}
int modinv(int x, int m = MOD)
{
     return modpow(x, m - 2, m);
}
 
 
int mul(int x, int y)
{
     return (x * y) % MOD;
}
 
constexpr int N = 2e5;
 
int f[N + 1], fi[N + 1];
 
void preSolve()
{
     f[0] = f[1] = fi[0] = fi[1] = 1;
     for (int i = 2; i <= N; i++)
     {
          f[i] = mul(f[i - 1], i);
          fi[i] = mul(fi[i - 1], modinv(i));
     }
}
 
int nCr(int n, int r)
{
     if (r > n) return 0;
     return mul(f[n], mul(fi[r], fi[n - r]));
}
 
//------------------------------------------------------------------------------
 
void solve()
{
                int n,m,k,q;
                cin >> n >> m >> k >> q;
 
                vector<pair<int,int>> v;
                map<pair<int,int>,int> mp;
                while(k--)
                {
                        int x,y;
                        cin >> x >> y;
                        v.pb({x,y});
                        mp[{x,y}]++;
                }
 
                sort(all(v));
 
                vector<string> ans = {"Carrots" , "Kiwis" , "Grapes"};
 
                while(q--)
                {
                        int l,r;
                        cin >> l >> r;
 
                        if(mp.find({l,r}) != mp.end())
                        {
                                cout << "Waste\n";
                                continue;
                        }
 
                        int total = (l - 1) * m + r ;
                        int waste = 0;
 
                        for(auto i : v)
                        {
                                if(i.fi < l)
                                        ++waste;
                                else if(i.fi == l && i.se <= r)
                                        ++waste;
                                else
                                        break;
                        }
 
                        int idx = (total - waste - 1)%3;
 
                        cout << ans[idx] << "\n";
                }
}
 
main()
{
        ios_base::sync_with_stdio(0);
        cin.tie(0);
 
        int t = 1;
        //cin>>t;
        while(t--)
        {
                                solve();
        }
}